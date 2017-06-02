package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Applicability {

    DerivedStateProcessorApplicability[] applicabilities();

}