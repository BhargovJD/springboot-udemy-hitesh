
public class DoubleExample {
    public static void main(String[] args) {

        double a = 0.1;
        double b = 0.2;

        // Floating-point arithmetic may be imprecise
        System.out.println(a + b);
    }
}
//BigDecimal is used for precise decimal arithmetic.
// It is especially useful for financial calculations because double can produce unexpected rounding errors.