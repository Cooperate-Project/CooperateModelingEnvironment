package de.cooperateproject.modeling.textual.sequence.naming;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.common.base.Strings;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.sequence.sequence.ActorClassifierMapping;
import de.cooperateproject.modeling.textual.sequence.sequence.CombinedFragment;
import de.cooperateproject.modeling.textual.sequence.sequence.ImplicitArrivalOccurenceSpecification;
import de.cooperateproject.modeling.textual.sequence.sequence.ImplicitSendOccurenceSpecification;
import de.cooperateproject.modeling.textual.sequence.sequence.MultipleRegionContainer;
import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer;
import de.cooperateproject.modeling.textual.sequence.sequence.RootPackage;
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram;
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider;

public class SequenceDiagramQualifiedNameProvider extends CooperateQualifiedNameProvider {

    protected QualifiedName qualifiedName(SequenceDiagram element) {
        QualifiedName rootName = getFullyQualifiedName(element.getRootPackage());
        if (rootName != null) {
            return rootName.append(getConverter().toQualifiedName(element.getTitle()));
        }
        return super.qualifiedName(element);
    }
    
    protected QualifiedName qualifiedName(ImplicitArrivalOccurenceSpecification element) {
        QualifiedName rootName = getFullyQualifiedName(element.eContainer());
        if (rootName != null) {
            return rootName.append(getConverter().toQualifiedName("rcv"));
        }
        return super.qualifiedName(element);
    }
    
    protected QualifiedName qualifiedName(ImplicitSendOccurenceSpecification element) {
        QualifiedName rootName = getFullyQualifiedName(element.eContainer());
        if (rootName != null) {
            return rootName.append(getConverter().toQualifiedName("snd"));
        }
        return super.qualifiedName(element);
    }
    
    protected QualifiedName qualifiedName(CombinedFragment element) {
        String localName = Optional.ofNullable(element.getName())
                   .orElseGet(() -> Optional.ofNullable(element.getAlias())
                           .orElse("_"));
        
        QualifiedName rootName = getFullyQualifiedName(element.eContainer());
        if (rootName != null) {
            return rootName.append(getConverter().toQualifiedName(localName));
        }
        return super.qualifiedName(element);
    }
    
    protected QualifiedName qualifiedName(OrderedFragmentContainer element) {
        EObject container = element.eContainer();
        if (SequencePackage.eINSTANCE.getSingleRegionContainer().isInstance(container)) {
            return getFullyQualifiedName(container).append(QualifiedName.create("_1"));
        } else if (SequencePackage.eINSTANCE.getMultipleRegionContainer().isInstance(container)) {
            int id = ((MultipleRegionContainer) container).getRegions().indexOf(element);
            assert id >= 0;
            return getFullyQualifiedName(container).append(QualifiedName.create(String.format("_%d", id)));
        }
        return super.qualifiedName(element);
    }
    
    protected QualifiedName qualifiedName(AliasedElement element) {
        if (!Strings.isNullOrEmpty(element.getAlias())) {
            QualifiedName rootName = getFullyQualifiedName(element.eContainer());
            if (rootName != null) {
                return rootName.append(getConverter().toQualifiedName(element.getAlias()));
            }
        }
        return qualifiedName((NamedElement) element);
    }
    
    protected QualifiedName qualifiedName(NamedElement element) {
        QualifiedName rootName = getFullyQualifiedName(element.eContainer());
        if (rootName != null) {
            return rootName.append(getConverter().toQualifiedName(element.getName()));
        }
        return super.qualifiedName(element);
    }
    
    protected QualifiedName qualifiedName(RootPackage element) {
        return getConverter().toQualifiedName(element.getName());
    }
    
    protected QualifiedName qualifiedName(ActorClassifierMapping element) {
        return getFullyQualifiedName(element.getActor()); 
    }

}
