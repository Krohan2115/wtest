package com.jap.bookstore;

public class Book {
    int ISBNNo;
    String bookName;
    Author author;
    String genre;
    float price;
    // Declare a parameterized constructor to initialize values
    public Book(int ISBNNo, String bookName, Author author, String genre, float price) {
    	this.ISBNNo = ISBNNo;
    	this.bookName =bookName;
    	this.author = author;
    	this.genre = genre;
    	this.price = price;
    }

    // Method to display the details of a book
    public String displayBookDetails()
    {
    	return ISBNNo+"::"+bookName+"::"+author.authorName+"::"+genre+":: $"+new Bookstore().calculateDiscount(this,25.0f);
    }


}
