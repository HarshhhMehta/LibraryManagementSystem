package org.example;

import org.example.model.Book;

import java.util.*;


public class LibraryManagementSystem {
    private static final List<Book> availableBooks = new ArrayList<>();
    public static List<Book> getAvailableBooks() {
        return Collections.unmodifiableList(availableBooks);
    }

    public void addBook(Book book) {
            availableBooks.add(book);
            System.out.println("Book with ISBN " + book.getISBN() + " added successfully!");
        }

}
