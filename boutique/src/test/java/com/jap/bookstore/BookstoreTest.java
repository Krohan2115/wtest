package com.jap.bookstore;

import com.jap.bookstore.Author;
import com.jap.bookstore.Book;
import com.jap.bookstore.Bookstore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookstoreTest
{
    private static final String message1 = "Display the book details in the given format";
    private static final String message2 = "The genre must be FICTION to get a discount";

    Book book,book1,book2;
    Author author,author1,author2;
    Bookstore bookStore;
    Book[] books ;

    @BeforeEach
void setUp(){
        author = new Author("Charles Darwin","Darwin");
        book = new Book(1123,"The Voyage of the Beagle",author, "SCIENTIFIC",120);
        author1 = new Author("JL Baird","Baird");
        book1 = new Book(1123,"Mocking Bird",author1,"FICTION",45);
        author2 = new Author("TS Elliot","Elliot");
        book2 = new Book(1123,"Jane Eyre",author,"FICTION",35);
        books = new Book[]{book,book1,book2};
        bookStore = new Bookstore("Just Read","1256",books);

}
@AfterEach
void tearDown(){
        author = null;
    author1 = null;
    author2 = null;
    book = null;
    book1 = null;
    book2 = null;
    bookStore = null;
    books = null;}

@Test
    public void givenBookObjectReturnBookDetails()
    {
        String expected = "1123::The Voyage of the Beagle::Charles Darwin::SCIENTIFIC:: $120.0";
        assertEquals(expected.toLowerCase(),book.displayBookDetails().toLowerCase(),message1);
    }
    @Test
    public void givenBookObjectAndDiscountPercentageCalculateDiscount()
    {

       assertEquals(120f,bookStore.calculateDiscount(books[0],25f),message2);
       assertEquals(33.75f,bookStore.calculateDiscount(books[1],25f),message2);
       assertEquals(26.25f,bookStore.calculateDiscount(books[2],25f),message2);

    }
}
