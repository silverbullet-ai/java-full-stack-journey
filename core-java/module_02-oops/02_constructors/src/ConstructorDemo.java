class Student {
    String name;

    // Default constructor
    Student() {
        name = "Unknown";
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("Name: " + s1.name);
    }
}