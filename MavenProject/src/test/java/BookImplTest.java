

import static org.junit.Assert.*;

import org.junit.Test;

import com.mavenexample.bookapplication.Book;
import com.mavenexample.bookapplication.BookNotFoundException;
import com.mavenexample.bookapplication.BookOperationsImplementation;

public class BookImplTest {

	BookOperationsImplementation bookimp;
		Book book;
		public void BookOperationsImplementationTest() {
			bookimp = new BookOperationsImplementation();
		}
		
		@Test
		public void testBookOperationsImplementation() {
			
		}

		@Test
		public void testGetAllBooks() {
			int numOfBooks = bookimp.listBooks.size();
			assertEquals(4, numOfBooks);
		}

		@Test
		public void testAddBook() {
			Book book = new Book(9, "Data structures", "3");
			bookimp.addBook(book);
			int numOfBooks = bookimp.listBooks.size();
			assertEquals(5, numOfBooks);
		}
		
		@Test
		public void testAddBookFalse() {
			Book book = new Book(9, "Data structures", "3");
			int numOfBooks = bookimp.listBooks.size();
			assertNotEquals(bookimp.listBooks.get(numOfBooks-1), bookimp.listBooks.add(book));
		}

		@Test
		public void testUpdateBook() {
			
			book= bookimp.listBooks.get(0);
			assertEquals(book, bookimp.updateBook("advanced java", "1"));
			
			
		}

		@Test
		public void testDelBook() {
			
			
			bookimp.delBook("5");
			int numOfBooks = bookimp.listBooks.size();
			assertEquals(3, numOfBooks);
			
		}
		
		@Test(expected = BookNotFoundException.class)
		public void testDelBookFalse() {
			bookimp.delBook("5");
			int numOfBooks = bookimp.listBooks.size();
			System.out.println(numOfBooks);
			assertNotEquals(3, numOfBooks);

	}

}
