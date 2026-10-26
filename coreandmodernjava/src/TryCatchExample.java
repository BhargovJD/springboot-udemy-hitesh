
public class TryCatchExample {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Reason:"+e.getMessage());

        }

        System.out.println("Program continues...");
    }
}
