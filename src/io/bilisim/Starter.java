package io.bilisim;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import io.bilisim.entity.Article;

public class Starter {

	public static void main(String[] args) {
		Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
		Set<ConstraintViolation<Article>> violations = validator.validate(initializeInstance(), Article.TitleDbValidator.class);
		violations.forEach(violation -> {
			System.out.println(violation.getMessage());
			violation.getConstraintDescriptor().getGroups().forEach(group -> {
				System.out.println(group.getCanonicalName());
			});
			violation.getConstraintDescriptor().getPayload().forEach(payload -> {
				System.out.println(payload.getCanonicalName());
			});
		});
	}
	
	static Article initializeInstance() {
		Article article = new Article();
		article.setAuthor("Author");
		article.setCategory(Arrays.asList("A","B"));
		article.setLastSaveDate(LocalDate.now());
		article.setPublish(false);
		article.setSubject("A");
		article.setText("Text");
		article.setTitle("Title");
		return article;
	}
}
