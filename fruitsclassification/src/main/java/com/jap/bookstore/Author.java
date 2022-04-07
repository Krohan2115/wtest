package com.jap.bookstore;

public class Author {
    // Implement data hiding by declaring member variables private

    String authorName;
    String authorPenName;

    //Declare getter and setter methods

    public String getAuthorName() {
    	return authorName;
    }
    public void setAuthorName(String authorName) {
    	this.authorName = authorName;
    }
    public String getAuthorPenName() {
    	return authorPenName;
    }
    public void setAuthorPenName(String  authorPenName) {
    	this.authorPenName=authorPenName;
    }
}
