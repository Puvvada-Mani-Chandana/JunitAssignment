package com.mavenexample.bookapplication;
import java.util.List;
interface BookOperations {
	public List<Book> getAllBooks();
	public void addBook(Book book);
	public Book updateBook(String isbn,String bookname);
	public void delBook(String isbn);
}
