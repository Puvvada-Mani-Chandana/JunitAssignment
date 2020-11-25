package com.mavenexample.bookapplication;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookOperationsImplementation implements BookOperations {

	public List<Book> listBooks;

	public BookOperationsImplementation() {
		listBooks = new ArrayList<Book>();
		listBooks.add(new Book(1, "c programming", "5"));
		listBooks.add(new Book(2, "c++", "9"));
		listBooks.add(new Book(3, "java", "4"));
		listBooks.add(new Book(4, "python", "7"));
	}

	public List<Book> getAllBooks() {
		System.out.println(listBooks.get(0));
		return listBooks;
	}

	public void addBook(Book book) {
		listBooks.add(book);
	}

	public Book updateBook(String bookName, String iSBN) {

		int index = 0;
		for (int i = 0; i < listBooks.size(); i++) {
			if (listBooks.get(i).getIsbn().equals(iSBN)) {
				index = i;
				listBooks.get(i).setBookname(bookName);
			}
		}
		return listBooks.get(index);
	}
	

	public void delBook(String iSBN) {

		boolean isIndex = false;
		for (int i = 0; i < listBooks.size(); i++) {
			if (listBooks.get(i).getIsbn().equals(iSBN)) {
				isIndex = true;
				listBooks.remove(i);
			}
		}
		if(!isIndex) {
			throw new BookNotFoundException("not found!");
		}

		
	}
}


