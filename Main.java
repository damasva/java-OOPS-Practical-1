// Define a class called Student
class Student {
    // Member variables (attributes)
    String name;
    int age;
    String course;

    // Member function (method)
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

// Main class to create objects and use the Student class
public class Main {
    public static void main(String[] args) {
        // Creating an object of Student class
        Student s1 = new Student();

        // Assigning values to member variables
        s1.name = "Damasva";
        s1.age = 20;
        s1.course = "Computer Science";

        // Calling the method using the object
        s1.displayDetails();

        // Creating another object
        Student s2 = new Student();
        s2.name = "Sree";
        s2.age = 22;
        s2.course = "Artifical Intelligence and Data Science";
        s2.displayDetails();
    }
}
