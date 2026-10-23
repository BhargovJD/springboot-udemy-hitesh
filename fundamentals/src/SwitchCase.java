
public class SwitchCase {
    public static void main(String[] args) {

        String paymentStatus = "FAILED";

        switch (paymentStatus) {
            case "SUCCESS":
                System.out.println("Payment successful");
                break;

            case "FAILED":
                System.out.println("Payment failed");
                break;

            case "PENDING":
                System.out.println("Payment pending");
                break;

            default:
                System.out.println("No status");
        }
    }
}
