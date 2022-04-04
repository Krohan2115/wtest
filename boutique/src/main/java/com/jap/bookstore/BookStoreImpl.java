package com.jap.bookstore;

public class BookStoreImpl {
	private static Author author,author1,author2;
	private static Book book,book1,book2;
	private static Book books[];
	private static Bookstore bookStore;
	
    public static void main(String[] args) {
        // Declare and initialize author, book and bookstore objects
    	 author = new Author("Charles Darwin","Darwin");
    	 book = new Book(1123,"The Voyage of the Beagle",author, "SCIENTIFIC",120);
    	 author1 = new Author("JL Baird","Baird");
    	 book1 = new Book(1123,"Mocking Bird",author1,"FICTION",45);
    	 author2 = new Author("TS Elliot","Elliot");
    	 book2 = new Book(1123,"Jane Eyre",author,"FICTION",35);
    	 books = new Book[]{book,book1,book2};
    	 bookStore = new Bookstore("Just Read","1256",books);
    	 
        //Display book details before discount is calculated
    	 System.out.println("The book details before discount : \n");
    	 for(Book displayBook: books) {
    		 System.out.println(displayBook.ISBNNo+"::"+displayBook.bookName+"::"+displayBook.author.authorName+"::"+displayBook.genre+":: $"+displayBook.price+"\n");
    	 		}

        //Calculate discount on the books by calling the methods

        //Display book details after discount is calculated
    	 System.out.println("\n\nThe book details after discount : \n");
    	 for(Book displayBook: books) {
    		 	System.out.println(displayBook.displayBookDetails()+"\n");
    	 }

        }

}
