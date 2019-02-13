package io.bilisim.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import io.bilisim.anotation.UniqueTitle;

public class UniqueTitleValidator implements ConstraintValidator<UniqueTitle, String> {
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		System.out.println("Title Value : " + value + " is valid");
		return false;
	}
}
