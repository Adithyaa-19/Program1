public class Book {
    private String bookname;
    private String author;
    private String publisher;
    private double price;
    private int yearOfPublished;

    // Constructor
    public Book(String bookname, String author, String publisher, double price, int yearOfPublished) {
        this.bookname = bookname;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.yearOfPublished = yearOfPublished;
    }

    // Display method
    public void display() {
        System.out.println("Book Name: " + bookname);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: $" + price);
        System.out.println("Year Published: " + yearOfPublished);
    }
}

