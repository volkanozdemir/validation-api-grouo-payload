package io.bilisim.entity;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import io.bilisim.anotation.UniqueTitle;
import io.bilisim.validator.payload.Severity;

public class Article {
	@NotBlank(message = "author  alaný boþ olamaz!")
	private String author;
	@NotNull(message = "Subject alaný boþ olamaz")
	@Pattern(regexp="A|B|C")
	private String subject;
	@NotEmpty(message = "category listesi bos olamaz")
	private List<@NotNull(message = "category elemanlarý null olamaz") String> category;
	@UniqueTitle(groups=Article.TitleDbValidator.class, message="Title benzersiz olmalý", payload=Severity.Error.class)
	private String title;
	@FutureOrPresent(message = "lastSaveDate geçmiþte olamaz")
	private LocalDate lastSaveDate;
	private Boolean publish;
	@NotBlank(message = "Text alaný null olamaz")
	private String text;

	public interface TitleDbValidator {
		
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<String> getCategory() {
		return category;
	}

	public void setCategory(List<String> category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getLastSaveDate() {
		return lastSaveDate;
	}

	public void setLastSaveDate(LocalDate lastSaveDate) {
		this.lastSaveDate = lastSaveDate;
	}

	public Boolean getPublish() {
		return publish;
	}

	public void setPublish(Boolean publish) {
		this.publish = publish;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
