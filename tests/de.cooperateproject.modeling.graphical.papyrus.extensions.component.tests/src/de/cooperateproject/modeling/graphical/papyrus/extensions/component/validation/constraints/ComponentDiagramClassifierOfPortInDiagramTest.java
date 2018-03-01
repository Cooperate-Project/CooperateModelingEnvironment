package de.cooperateproject.modeling.graphical.papyrus.extensions.component.validation.constraints;

import org.junit.Test;

import de.cooperateproject.modeling.graphical.papyrus.extensions.tests.commons.constraints.CooperateConstraintTestBase;
import de.cooperateproject.modeling.graphical.papyrus.extensions.component.validation.constraints.ComponentDiagramClassifierOfPortInDiagram;


public class ComponentDiagramClassifierOfPortInDiagramTest extends CooperateConstraintTestBase {

	public ComponentDiagramClassifierOfPortInDiagramTest() {
		super(ComponentDiagramClassifierOfPortInDiagram.class);
	}
	

	@Test 
    public void testClassifierInOtherDiagram() {
        testFail("cmpClassifierInOtherDiagram.notation");
    }
    
    @Test 
    public void testClassifierInSameDiagram() {
        testSuccess("cmpClassifierInSameDiagram.notation");
    }
}
