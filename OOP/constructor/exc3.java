package constructor;
class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        title = "Noma'lum";
        author = "Noma'lum";
        price = 0.0;
        System.out.println("Default Constructor:");
        printInfo();
    }

    // Constructor with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
        System.out.println("Constructor with Title and Author:");
        printInfo();
    }

    // Constructor with title, author, and price
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Constructor with Title, Author and Price:");
        printInfo();
    }

    // Method to print book information
    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println();
    }


}

public class exc3 {
    public static void main(String[] args) {
        Book b1 = new Book(); // default constructor
        Book b2 = new Book("Java Dasturlash", "Aliyev"); // 2-param constructor
        Book b3 = new Book("Clean Code", "Robert C. Martin", 29.99); // 3-param constructor
    }
}
