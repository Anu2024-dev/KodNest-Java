
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the student name and two marks
        // Calculate and print the total
        String name = sc.next();
        int java = sc.nextInt();
        int sql = sc.nextInt();
        int total = java + sql;
        System.out.println("Student: " + name);
        System.out.println("Total: " + total);
        sc.close();
    }
}
