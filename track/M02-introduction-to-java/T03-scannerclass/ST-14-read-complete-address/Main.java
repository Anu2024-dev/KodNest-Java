
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the complete address
        // Print the address
        String add = scanner.nextLine();
        System.out.println("Address: " + add);
        scanner.close();
    }
}
