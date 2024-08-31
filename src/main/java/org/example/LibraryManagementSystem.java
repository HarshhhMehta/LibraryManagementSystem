package org.example;

import org.example.model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LibraryManagementSystem {
    private static final List<Book> availableBooks = new ArrayList<>();

    public static List<Book> getAvailableBooks() {
        return Collections.unmodifiableList(availableBooks);
    }

    public void addBook(Book book) {
        if (book.getTitle().isEmpty()) {
            throw new IllegalArgumentException("Book title cannot be empty!");
        }
        availableBooks.add(book);
        System.out.println("Book with ISBN " + book.getISBN() + " added successfully!");
    }


}
