
import java.util.Scanner;

class Student {

    // Declare id, name and javaScore
    int id;
    String name;
    int javaScore;
;

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create and populate the first Learner object
        Student s1 = new Student();
        s1.id = sc.nextInt();
        s1.name = sc.next();
        s1.javaScore = sc.nextInt();

        // Create and populate the second Learner object
        Student s2 = new Student();
        s2.id = sc.nextInt();
        s2.name = sc.next();
        s2.javaScore = sc.nextInt();

        // Read the new score
        int newScore = sc.nextInt();

        // Display both records before the update
        System.out.println("Before Update");
        System.out.println(s1.id + " - " + s1.name + " - " + s1.javaScore);
        System.out.println(s2.id + " - " + s2.name + " - " + s2.javaScore);

        // Update only the first object
        s1.javaScore = newScore;

        System.out.println("After Update");
        // Display both records after the update
        System.out.println(s1.id + " - " + s1.name + " - " + s1.javaScore);
        System.out.println(s2.id + " - " + s2.name + " - " + s2.javaScore);
    }
}
