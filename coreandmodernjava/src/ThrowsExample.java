
public class ThrowsExample {

    // Declare that this method may throw an exception
    static void checkAge(int age) throws Exception {

        if (age < 18) { // Check whether the person is under 18

            // Throw an exception if the condition is true
            throw new Exception("Age must be 18 or above");
        }

        // Print this if the age is valid
        System.out.println("Eligible");
    }

    public static void main(String[] args) {

        try {
            // Call the method with age 16
            checkAge(10);

        } catch (Exception e) {
            // Handle the exception and print its message
            System.out.println(e.getMessage());
        }
    }
}
