package de.cooperateproject.modeling.textual.common.util;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.eclipse.emf.ecore.EClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.util.DynamicTextualCommonsSwitch;

public class DynamicTextualCommonsSwitchTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(DynamicTextualCommonsSwitchTest.class);

    private static class EClassAcceptanceChecker extends DynamicTextualCommonsSwitch<Void> {
        public boolean isEClassAccepted(EClass eClass) {
            try {
                this.doSwitch(eClass, null);
                return true;
            } catch (Exception e) {
                LOGGER.error("Switching failed.", e);
                return false;
            }
        }
    };

    @Test
    public void testAllClassesHandled() {
        EClassAcceptanceChecker subject = new EClassAcceptanceChecker();

        List<EClass> testClasses = StreamSupport
                .stream(Spliterators.spliteratorUnknownSize(TextualCommonsPackage.eINSTANCE.eAllContents(),
                        Spliterator.ORDERED), false)
                .filter(EClass.class::isInstance).map(EClass.class::cast).collect(Collectors.toList());

        for (EClass testClass : testClasses) {
            assertTrue("The class " + testClass.getName() + " is not handled correctly.",
                    subject.isEClassAccepted(testClass));
        }
    }

}
