
import java.util.Scanner; // Imports Scanner to take input from the user.

public class MovieInvoice { // Defines a class named MovieInvoice.

    public static void main(String[] args) { // Main method: execution starts here.

        Scanner scanner = new Scanner(System.in);
        // Creates a Scanner object to read keyboard input.

        System.out.println("Enter movie name");
        // Displays a message asking the user to enter the movie name.

        String movieName = scanner.nextLine();
        // Reads the complete movie name entered by the user and stores it in movieName.

        System.out.println("Enter total ticket");
        // Displays a message asking the user to enter the number of tickets.

        int totalTicket = scanner.nextInt();
        // Reads the number of tickets and stores it in totalTicket.

        int price = totalTicket * 100;
        // Calculates the total price by multiplying the ticket count by ₹100.
        // Example: 3 tickets * ₹100 = ₹300.

        System.out.println("Total: " + price);
        // Displays the total ticket price.

        scanner.close();
        // Closes the Scanner after taking input.


        /*
        multi
        line
        comments
         */

    }
}
