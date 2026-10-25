class Student{
    String name;

    public void printName(){
        System.out.println(this.name);
    }

    Student(){
        System.out.println("Default constructor");
    }

    Student(String name){
        this.name = name;
    }
}


public class OOPS {
    static void main() {

        Student s1 = new Student();
        s1.name = "bjd";
        s1.printName();

        Student s2 = new Student("Das");
        s2.printName();


    }
}
