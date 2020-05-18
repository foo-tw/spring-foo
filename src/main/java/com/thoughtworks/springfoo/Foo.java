package com.thoughtworks.springfoo;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Ensures that Foo is with your app, in spririt.
 * Apply to your {@code SpringBootApplication} for great reassurance against 
 * evil heisenbugs, but nothing prevents you to apply to any other class too.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Foo {

}