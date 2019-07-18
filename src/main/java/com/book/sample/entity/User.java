package com.book.sample.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

	/** ID */
	private long id;
	/** Email */
	private String email;
	/** Password */
	private String password;
	/** Username */
	private String username;
	/** Last Login Date */
	private String lastLoginDate;
	/** User Active Flag */
	private int active;
	/** Profile Image Id */
	private long profileImageId;
}
