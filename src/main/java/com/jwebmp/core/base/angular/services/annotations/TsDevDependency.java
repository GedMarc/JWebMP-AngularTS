package com.jwebmp.core.base.angular.services.annotations;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Target({TYPE, METHOD})
@Retention(RUNTIME)
@Repeatable(TsDevDependencies.class)
@Inherited
public @interface TsDevDependency
{
	/**
	 * The string name of the dev dependency for the given ng app
	 *
	 * @return
	 */
	String value();
	
	/**
	 * The version of the plugin (without any ~)
	 *
	 * @return
	 */
	String version();
}