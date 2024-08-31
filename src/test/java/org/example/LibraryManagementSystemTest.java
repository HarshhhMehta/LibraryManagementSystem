package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryManagementSystemTest {

    LibraryManagementSystem lms;

    //to get instance of class before running every test case
    @BeforeEach
    public void setUp(){
        lms = new LibraryManagementSystem();
    }
    @Test
    public void addBookTest(){
        Book book=new Book("title","987-123-456-6789","Harsh",2003);
    }
}