
import java.util.Scanner;

class StudentUtility {

    void displayName(String name) {
        // Print student name
        System.out.println("Student: " + name);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        // Create object
        StudentUtility s = new StudentUtility();
        // Call displayName()
        s.displayName(name);
    }
}
