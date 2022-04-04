package com.jap.bookstore;

public class Bookstore {
    String bookStoreName;
    String bookStoreRegistrationId;
    Book[] books;
    // Declare a parameterized constructor to initialize values
    public Bookstore(String bookStoreName, String bookStoreRegistrationId, Book[] books) {
        this.bookStoreName = bookStoreName;
        this.bookStoreRegistrationId = bookStoreRegistrationId;
        this.books = books;
    }
    public Bookstore() {
        // TODO Auto-generated constructor stub
    }
    // Function to calculate the discount for a genre of books
    public float calculateDiscount(Book book,float discountPercentage)
    {
        if(!book.genre.equalsIgnoreCase("fiction")) {
            return book.price;
        }
        return book.price-((discountPercentage*book.price)/100);
    }
}