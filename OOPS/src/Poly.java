class Emp{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);

    }

    public void printInfo(int age){
        System.out.println(age);
    }
}



public class Poly {

    static void main() {
        Emp e1 = new Emp();
        e1.name = "bjd";
        e1.age =34;

        System.out.println(e1.name);
        e1.printInfo("das");
        e1.printInfo(30);
    }
}
