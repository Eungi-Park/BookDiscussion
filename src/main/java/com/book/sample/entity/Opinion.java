package com.book.sample.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Opinion {

	/** ID */
	private long id;
	/** Topic ID */
	private long topicId;
}
