package org.example;

import org.example.model.Book;
import org.junit.jupiter.api.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class LibraryManagementSystemTest {
    public static final List<Book> availableBooks = LibraryManagementSystem.getAvailableBooks();

    LibraryManagementSystem lms;

    //to get instance of class before running every test case
    @BeforeEach
    public void setUp() {
        lms = new LibraryManagementSystem();
    }

    @Test
    public void addBookTest() {
        Book book = new Book("title", "987-123-123-9876", "author", 2004);
        // number of books before adding
        int noOfBooks = availableBooks.size();
        lms.addBook(book);
        assertEquals(noOfBooks + 1, availableBooks.size());
        assertTrue(availableBooks.contains(book));
    }

    @Test
    public void addBookWithEmptyTitleTest() {
        Book book = new Book("", "133-123-123-9875", "author", 2004);
        assertThrows(IllegalArgumentException.class, () -> lms.addBook(book), "Adding a book with empty title should throw an IllegalArgumentException");
    }
    @Test
    public void addBookWithNullTitleTest() {
        Book book = new Book(null, "132-123-123-9875", "author", 2004);
        assertThrows(IllegalArgumentException.class, () -> lms.addBook(book),
                "Adding a book with null title should throw an IllegalArgumentException");
    }

    @Test
    public void addBookWithEmptyAuthorTest() {
        Book book = new Book("title", "134-123-123-9875", "", 2004);
        assertThrows(IllegalArgumentException.class, () -> lms.addBook(book),
                "Adding a book with empty author name should throw an IllegalArgumentException");
    }

    @Test
    public void addBookWithNullAuthorTest() {
        Book book = new Book("title", "135-123-123-9875", null, 2004);
        assertThrows(IllegalArgumentException.class, () -> lms.addBook(book),
                "Adding a book with null author name should throw an IllegalArgumentException");
    }
}