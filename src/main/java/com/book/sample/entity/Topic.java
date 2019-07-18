package com.book.sample.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Topic {

	/** ID */
	private long id;
	/** Book ID */
	private long BookId;
}
