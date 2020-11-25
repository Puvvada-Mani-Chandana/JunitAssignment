package com.mavenexample.bookapplication;

public class Book {
	private int id;
	private String bookname;
	private String isbn;
	public Book() {
		
	}
	public Book(int id, String bookname, String isbn) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.isbn = isbn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [id=");
		builder.append(id);
		builder.append(", bookname=");
		builder.append(bookname);
		builder.append(", isbn=");
		builder.append(isbn);
		builder.append("]");
		return builder.toString();
	}
	

}
