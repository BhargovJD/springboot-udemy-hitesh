
// Define a class named Book.
// A class is a blueprint for creating book objects.
class Book {

    // Instance variable to store the book's title.
    String title;

    // Instance variable to store the book's price.
    double price;

    // Default constructor.
    // This constructor runs when we create a Book object without arguments.
    Book() {
        System.out.println("Default constructor");
    }

    // Parameterized constructor.
    // It accepts two values: title and price.
    Book(String title, double price) {

        // 'this.title' refers to the object's instance variable.
        // The right-side 'title' refers to the constructor parameter.
        this.title = title;

        // Store the given price in the object's price variable.
        this.price = price;
    }
}

// Main class of the program.
public class BookLibrary {

    // Program execution starts here when using a Java launcher
    // that supports this main-method form.
    static void main() {

        // Create a Book object using the parameterized constructor.
        // "Assamese bok" is passed as title.
        // 12.00 is passed as price.
        Book b1 = new Book("Assamese bok", 12.00);

        // Print the object's reference.
        // Without overriding toString(), this usually prints
        // the class name followed by @ and a hash-code representation.
        System.out.println(b1);

        // Print the title stored in the first book object.
        System.out.println(b1.title);

        // Print the price stored in the first book object.
        System.out.println(b1.price);

        // Create a second, separate Book object.
        // Its title is "Englisj bok" and its price is 33.00.
        Book b2 = new Book("Englisj bok", 33.00);

        // Print the second object's reference representation.
        System.out.println(b2);

        // Print the title of the second book.
        System.out.println(b2.title);

        // Print the price of the second book.
        System.out.println(b2.price);
    }
}
