class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {

        Student s1 = new Student("Aahish", 21);

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}