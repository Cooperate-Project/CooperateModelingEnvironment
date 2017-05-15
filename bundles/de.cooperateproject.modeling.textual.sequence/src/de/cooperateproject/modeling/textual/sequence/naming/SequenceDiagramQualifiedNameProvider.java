package de.cooperateproject.modeling.textual.sequence.naming;

import org.eclipse.xtext.naming.QualifiedName;

import de.cooperateproject.modeling.textual.sequence.sequence.ActorClassifierMapping;
import de.cooperateproject.modeling.textual.sequence.sequence.RootPackage;
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateQualifiedNameProvider;

public class SequenceDiagramQualifiedNameProvider extends CooperateQualifiedNameProvider {
    
    protected QualifiedName qualifiedName(SequenceDiagram element) {
        QualifiedName rootName = getFullyQualifiedName(element.getRootPackage());
        if (rootName != null) {
            return rootName.append(getConverter().toQualifiedName(element.getTitle()));
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
