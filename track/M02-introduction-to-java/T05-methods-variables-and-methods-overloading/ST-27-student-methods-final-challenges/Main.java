
import java.util.Scanner;

class Student {

    String name;

    void setName(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void showName() {
        // Print the stored name
        System.out.println("Student Name: " + name);
    }

    void showScore(int first) {
        // Print the first score
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        // Print the total of two scores
        System.out.println("Two-Score Total: " + (first + second));
    }
}

public class Main {

    public static void main(String args) {
        Scanner sc = new Scanner(System.in);

        // Read the full name and two scores
        String str = sc.nextLine();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        // Create one Student object
        Student s = new Student();
        // Store and print the name
        s.setName(str);
        s.showName();
        // Call both showScore() methods
        s.showScore(n1);
        s.showScore(n1, n2);
    }
}
