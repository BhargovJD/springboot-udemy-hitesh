
public class IfElse {
    public static void main(String[] args) {
        String paymentStatus = "SUCCESS";

        if (paymentStatus.equals("SUCCESS")) {
            System.out.println("Payment successful");
        } else if (paymentStatus.equals("FAILED")) {
            System.out.println("Payment failed");
        } else if (paymentStatus.equals("PENDING")) {
            System.out.println("Payment pending");
        } else {
            System.out.println("No status");
        }
    }
}
