package com.jap.bookstore;

public class BookStoreImpl {
    private static Author author,author1,author2;
    private static Book book,book1,book2;
    private static Book books[];
    private static Bookstore bookStore;
    
    public static void main(String[] args) {
        // Declare and initialize author, book and bookstore objects
        // Use the get and set methods to set values to the variables
        author = new Author();
        author.setAuthorName("Charles Darwin");
        author.setAuthorPenName("Darwin");
        book = new Book();
        book.setISBNNo(1123);
        book.setBookName("The Voyage of the Beagle");
        book.setAuthor(author);
        book.setGenre("SCIENTIFIC");
        book.setPrice(120);
        
        
        author1 = new Author();
        author1.setAuthorName("JL Baird");
        author1.setAuthorPenName("Baird");
        book1 = new Book();
        book1.setISBNNo(1123);
        book1.setBookName("Mocking Bird");
        book1.setAuthor(author1);
        book1.setGenre("FICTION");
        book1.setPrice(45);
        
        
        author2 = new Author();
        author2.setAuthorName("TS Elliot");
        author2.setAuthorPenName("Elliot");
        book2 = new Book();
        book2.setISBNNo(1123);
        book2.setBookName("Jane Eyre");
        book2.setAuthor(author2);
        book2.setGenre("FICTION");
        book2.setPrice(35);
        
        books = new Book[]{book,book1,book2};
        
        
        bookStore = new Bookstore();
        bookStore.setBookStoreName("Just Read");
        bookStore.setBookStoreRegistrationId("1256");
        bookStore.setBooks(books);

        //Display book details before discount is calculated
        System.out.println("The book details before discount : \n");
        for(Book displayBook: books) {
            System.out.println(displayBook.getISBNNo()+"::"+displayBook.getBookName()+"::"+displayBook.getAuthor().getAuthorName()+"::"+displayBook.getGenre()+":: $"+displayBook.getPrice()+"\n");
        }

        //Calculate discount on the books by calling the methods

        //Display book details after discount is calculated
        System.out.println("\n\nThe book details after discount : \n");
        for(Book displayBook: books) {
            System.out.println(displayBook.displayBookDetails()+"\n");
        }

        }
}
