package com.pradeep.demo.exception;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(Long id) {
		super("Cannot find the id: " + id);
	}
}
