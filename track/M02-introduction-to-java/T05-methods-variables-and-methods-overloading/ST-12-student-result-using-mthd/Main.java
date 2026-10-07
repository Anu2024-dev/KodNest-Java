
import java.util.Scanner;

class StudentResult {

    void showTitle() {
        System.out.println("Student Result");
    }

    void displayName(String name) {
        System.out.println("Name: " + name);
    }

    int getPassingMark() {
        return 40;
    }

    int calculateAverage(int first, int second) {
        int avg = (first + second) / 2;
        return avg;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        StudentResult sr = new StudentResult();
        // Call methods
        sr.showTitle();
        sr.displayName(name);
        int pm = sr.getPassingMark();
        int avg = sr.calculateAverage(first, second);
        // Print returned values
        System.out.println("Passing Mark: " + pm);
        System.out.println("Average: " + avg);
    }
}
