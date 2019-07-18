package com.book.sample.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Comment {

	/** ID */
	private long id;
	/** Opinion ID */
	private long opinionId;
}
