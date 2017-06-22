package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines the applicability of an {@link IAtomicDerivedStateProcessor} element.
 */
@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Applicability {

    /**
     * Defines the stages in which the processor is applicable. There can be multiple supported stages.
     * 
     * @return The supported stages.
     */
    DerivedStateProcessorApplicability[] applicabilities();

}