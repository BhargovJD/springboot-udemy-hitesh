package accessmodifiers.test;

import accessmodifiers.school.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Bhargov";
        student.sayHello();
    }
}