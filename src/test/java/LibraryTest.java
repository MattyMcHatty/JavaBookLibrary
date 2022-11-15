import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(3);
        book1 = new Book("The Shining", "Stephen King", "Horror");
        book2 = new Book("Dracula", "Bram Stoker", "Horror");
        book3 = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
        borrower = new Borrower();
    }

    @Test
    public void canCountBooksInLibrary(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void returnsMessageIfLibraryIsFull(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(3, library.countBooks());
        library.addBook(book1);
        assertEquals(3, library.countBooks());
    }

    @Test
    public void borrowerTakesBookFromLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.countBooks());
        borrower.takeBook(library, book2);
        assertEquals(2, library.countBooks());
        assertEquals(1, borrower.countBooks());
    }



}
