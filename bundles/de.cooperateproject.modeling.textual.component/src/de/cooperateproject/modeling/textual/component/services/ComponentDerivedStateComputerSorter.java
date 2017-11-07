package de.cooperateproject.modeling.textual.component.services;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.component.cmp.Attribute;
import de.cooperateproject.modeling.textual.component.cmp.Classifier;
import de.cooperateproject.modeling.textual.component.cmp.Connector;
import de.cooperateproject.modeling.textual.component.cmp.ConnectorEnd;
import de.cooperateproject.modeling.textual.component.cmp.Port;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IDerivedStateComputerSorter;

public class ComponentDerivedStateComputerSorter implements IDerivedStateComputerSorter {

	
	@Override
	public int compare(EObject o1, EObject o2) {
		int prio1 = o1 instanceof Classifier ? 3 : 0;
		prio1 = o1 instanceof Port? 2: prio1;
		prio1 = o1 instanceof Attribute? 2: prio1;
		prio1 = o1 instanceof Connector? 1: prio1;
		prio1 = o1 instanceof ConnectorEnd? 1: prio1;
		
        int prio2 = o2 instanceof Classifier ? 3 : 0;
        prio2 = o2 instanceof Port? 2: prio2;
		prio2 = o2 instanceof Attribute? 2: prio2;
        prio2 = o2 instanceof Connector? 1: prio2;
        prio2 = o2 instanceof ConnectorEnd? 1: prio2;
        
        return prio2 - prio1;
	}

}
