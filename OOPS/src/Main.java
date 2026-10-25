class Person {
    static String school = "ABC School";
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Person.school);
    }
}

//Because school is static, it belongs to the Student class.
//You can access it using the class name without creating an object.