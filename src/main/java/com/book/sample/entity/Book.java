package com.book.sample.entity;

import java.util.List;

import javax.validation.constraints.Null;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {

	/** ID */
	private long id;
	/** Main Title */
	private String title;
	/** Sub Title */
	private String subTitle;
	/** Author */
	private String author;
	/** Publisher */
	private String publisher;
	/** Publication Date */
	private String publicationDate;
	/** Genre */
	private String genre;
	/** Keywords */
	private List keywords;
	/** Volume */
	@Null
	private String volume;
	
}
