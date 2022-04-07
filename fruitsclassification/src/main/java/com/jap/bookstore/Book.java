package com.jap.bookstore;

public class Book {
    // Implement data hiding by declaring member variables private
    int ISBNNo;
    String bookName;
    Author author;
    String genre;
    float price;

    // Declare getter and setter methods
    public int getISBNNo() {
    	return ISBNNo;
    }
    public void setISBNNo(int iSBNNo) {
    	this.ISBNNo = iSBNNo;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Method to display the details of a book
    public String displayBookDetails()
    {
        return getISBNNo()+"::"+getBookName()+"::"+author.getAuthorName()+"::"+getGenre()+"::$"+new Bookstore().calculateDiscount(this,25.0f);
    }


}
