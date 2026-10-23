
public class GameLogic {
    public static void main(String[] args) {
        int age = 11;
        String nationality = "Indian";

        if (age >= 18 && nationality.equals("Indian")) {
            System.out.println("You can vote");
        }
        else {
            System.out.println("Sorry, you can not vote");
        }

//        Type conversion
        int count = 12;
        System.out.println(count);
        double newCount = count;
        System.out.println(newCount);

        int againNewCount = (int)newCount;
        System.out.println(againNewCount);
    }
}
