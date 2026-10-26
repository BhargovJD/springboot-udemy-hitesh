
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int marks;

    // Constructor to initialize student details
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {

        // Create a list of students
        List<Student> students = new ArrayList<>();

        // Add student objects
        students.add(new Student("Rahul", 75));
        students.add(new Student("Amit", 90));
        students.add(new Student("Priya", 80));

        // Sort students by marks in ascending order
        students.sort(Comparator.comparingInt(s -> s.marks));

        // Print student details
        for (Student s : students) {
            System.out.println(s.name + " - " + s.marks);
        }
    }
}
