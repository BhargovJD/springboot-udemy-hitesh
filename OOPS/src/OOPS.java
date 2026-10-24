import jdk.jshell.PersistentSnippet;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

}

class Student{
    String name;

    public void printName(){
        System.out.println(this.name);
    }
}


public class OOPS {
    static void main() {

        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";
        pen1.write();
        pen1.printColor();
        System.out.println("...............");

        Pen pen2 = new Pen();
        pen2.color = "blue";
        pen2.type = "ball";
        pen2.write();
        pen2.printColor();
        System.out.println("...............");


        Student s1 = new Student();
        s1.name = "bjd";
        s1.printName();

    }
}
