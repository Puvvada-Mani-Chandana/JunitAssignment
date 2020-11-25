package com.mavenexample.bookapplication;

public class BookNotFoundException extends RuntimeException{
	
	public BookNotFoundException(String message) {
		super(message);
	}
}
