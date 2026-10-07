
import java.util.Scanner;

class Student {

    // Declare id, name, course and javaScore
    int id;
    String name;
    String course;
    double javaScore;

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create one Student object
        Student s = new Student();
        // Read and store all values in the object
        s.id = sc.nextInt();

        s.name = sc.next();
        s.course = sc.next();
        s.javaScore = sc.nextDouble();

        // Display the values stored in the object
        System.out.println("Student Profile");
        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
        System.out.println("Course: " + s.course);
        System.out.println("Java Score: " + s.javaScore);
    }
}
