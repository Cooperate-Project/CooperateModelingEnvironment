package de.cooperateproject.modeling.textual.sequence.intermediate

import de.cooperateproject.modeling.textual.sequence.sequence.Actor
import de.cooperateproject.modeling.textual.sequence.sequence.Fragment
import de.cooperateproject.modeling.textual.sequence.sequence.MessageType
import de.cooperateproject.modeling.textual.sequence.sequence.MultipleRegionContainer
import de.cooperateproject.modeling.textual.sequence.sequence.ResponseMessage
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram
import de.cooperateproject.modeling.textual.sequence.sequence.StandardMessage
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIDiagram
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SIExecution
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SILifeline
import de.cooperateproject.modeling.textual.sequence.sequenceintermediate.SequenceIntermediateFactory
import java.util.ArrayList
import java.util.Collection
import java.util.Collections
import java.util.Deque
import java.util.HashMap
import java.util.LinkedList
import java.util.Map
import java.util.Objects
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.xbase.lib.Functions.Function1

class IntermediateModelTransformation {
    public static val NO_SUITABLE_REQUEST_FOR_RESPONSE = [ResponseMessage rsp| '''The model is inconsistent. There is no suitable request for response «rsp.name».''']
    protected static class ExecutionFrame {
        new (SIExecution execution) {
            this.execution = execution
        }
        public val SIExecution execution
        public var ExecutionFrame blockedBy
    }
    
    protected val Map<Fragment, Integer> fragmentIndices
    protected val Map<SILifeline, Deque<ExecutionFrame>> activeExecutions
    protected val Collection<Diagnostic> issues
    protected val SequenceDiagram sourceDiagram
    protected val Resource targetResource    
    
    private val siFac = SequenceIntermediateFactory.eINSTANCE
     
    var SIDiagram result = null
    
    new (SequenceDiagram source, Resource targetResource) {
        fragmentIndices = Collections.unmodifiableMap(new HashMap => [m |
         source.eAllContents.filter(Fragment).fold(0, [c, f | m.put(f, c); c + 1])   
        ])
        issues = new ArrayList
        this.sourceDiagram = source
        this.targetResource = targetResource
        this.activeExecutions = new HashMap
    }
    
    protected def int fragmentIndex(Fragment fragment) {
        fragmentIndices.getOrDefault(fragment, -1)
    }
    
    protected def SILifeline getIntermediateElement(Actor actor) {
        Objects.requireNonNull(result);
        
        result.lifelines.findFirst[referencedElement == actor]
    }
    
    
    public def SIDiagram getIntermediateModel() {
        if (result === null) {
            transform()
        }
        result
    }
    
    protected def transform() {
        targetResource.contents += result = siFac.createSIDiagram => [
            referencedElement = sourceDiagram
        ]
    }
    
    protected def dispatch void transformInternal(SIDiagram diagram) {
        diagram.lifelines += diagram.referencedElement.actors.map[act | 
            siFac.createSILifeline => [
                referencedElement = act
            ]
        ]
        
        diagram.referencedElement.fragments.forEach[processFragment]
    }
    
    protected def dispatch void processFragment(Fragment fragment) {
        throw new UnsupportedOperationException('''Unsupported base case for element type «fragment.class.name»''')
    }
    
    protected def ExecutionFrame getSuitableExecutionFrame(SILifeline lifeline, StandardMessage message) {
        if (lifeline !== null) {
            val efStack = activeExecutions.get(lifeline)
            
            val cand = efStack.findFirst[blockedBy === null]
            return if (cand !== null) cand else efStack.peek
        }        
    }
    
    protected def void terminateBlockingFrames(ExecutionFrame frame) {
        val blockers = new LinkedList
        for (var blck = frame.blockedBy; blck !== null; blck = blck.blockedBy) blockers.push(blck)
        
        blockers.forEach[blocker |
            activeExecutions.get(blocker.execution.lifeline).remove(blocker)
        ]
        frame.blockedBy = null
    }
    
    protected def dispatch void processFragment(StandardMessage message) {
        val llLeft = message.left?.intermediateElement
        val llRight = message.right?.intermediateElement
        
        val siMsg = siFac.createSIMessage => [referencedElement = message]
        
        val sourceFrame = llLeft.getSuitableExecutionFrame(message)
            
        if (sourceFrame !== null) {
            sourceFrame.execution.messages.add(siMsg)
            sourceFrame.terminateBlockingFrames
        } else if (llLeft !== null) {
            if (!activeExecutions.containsKey(llLeft)) {
                activeExecutions.put(llLeft, new LinkedList)
            }
            activeExecutions.get(llLeft).push(new ExecutionFrame(siFac.createSIExecution => [ siEx |
                siEx.lifeline = llLeft
                siEx.start = siFac.createStartDeterminesPointIntTime => [
                    timedElement = siMsg
                ]
                siEx.messages.add(siMsg)           
                siEx.container = result
            ]))
        }
        
        val targetExecutionFrame = if (llRight !== null)
            new ExecutionFrame(siFac.createSIExecution => [ siEx |
                siEx.executionCause = siMsg
                siEx.lifeline = llRight
                siEx.start = siFac.createFinishDeterminesPointInTime => [
                    timedElement = siEx.executionCause
                ]           
                siEx.container = if (sourceFrame === null || message.type == MessageType.ASYNC) result
                    else sourceFrame.execution
            ]) else null;
        
        if (targetExecutionFrame !== null) {
            activeExecutions.get(llRight).push(targetExecutionFrame)
            
            if (sourceFrame !== null && message.type == MessageType.SYNC) {
                sourceFrame.blockedBy = targetExecutionFrame
            }    
        }
    }
    
    protected def dispatch void processFragment(ResponseMessage rsp) {
        val llLeft = rsp.left?.intermediateElement
        val llRight = rsp.right?.intermediateElement
        
        val siRsp = siFac.createSIMessage => [referencedElement = rsp]
        val reqMsg = rsp.correspondingRequest
        
        val executionToClose = activeExecutions.get(llLeft).findFirst[execution.executionCause.referencedElement == reqMsg]
        
        if (executionToClose !== null) {
            if (executionToClose.blockedBy !== null) executionToClose.terminateBlockingFrames
            activeExecutions.get(llLeft).remove(executionToClose)
            executionToClose.execution.finish = siFac.createStartDeterminesPointIntTime => [timedElement = siRsp]
            executionToClose.execution.syncReply = siRsp
        } else {
            createIssue(NO_SUITABLE_REQUEST_FOR_RESPONSE, rsp)
        }
        
        if (llRight !== null) {
            activeExecutions.get(llRight).findFirst[blockedBy == executionToClose].blockedBy = null
        }
    }
    
    protected def dispatch void processFragment(MultipleRegionContainer rsp) {
        
    }
    
    
    protected def <T extends EObject> void createIssue(Function1<? super T, CharSequence> cause, T problematicElement) {
        createIssue(cause.apply(problematicElement), problematicElement)
    }
    
    protected def void createIssue(CharSequence cause, EObject problematicElement) {
        
    }
    
}