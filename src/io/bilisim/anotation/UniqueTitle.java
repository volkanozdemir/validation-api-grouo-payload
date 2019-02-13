package io.bilisim.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import io.bilisim.validator.UniqueTitleValidator;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=UniqueTitleValidator.class)
public @interface UniqueTitle {

	String message() default "";
	
	Class<? extends Payload>[] payload() default {};
	
	Class<?>[] groups() default {};
	
}
