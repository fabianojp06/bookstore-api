package com.fabiano.bookstore.service.exceptions;

public class ObjectNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ObjectNotFoundException(String message, Object object) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	

}
