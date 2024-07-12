package com.cydeo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // it means we'll use the annotation top of method
@Retention(RetentionPolicy.RUNTIME)
public @interface LoggingAnnotation {
}
