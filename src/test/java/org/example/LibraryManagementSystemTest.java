package org.example;

import org.example.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LibraryManagementSystemTest {
    public static final List<Book> availableBooks = LibraryManagementSystem.getAvailableBooks();

    LibraryManagementSystem lms;

    //to get instance of class before running every test case
    @BeforeEach
    public void setUp(){
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
}