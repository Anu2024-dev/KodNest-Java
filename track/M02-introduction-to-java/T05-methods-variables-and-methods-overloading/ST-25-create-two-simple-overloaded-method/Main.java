
import java.util.Scanner;

class Printer {

    void show(int number) {
        // Print the number
        System.out.println("Number: " + number);
    }

    void show(String word) {
        // Print the word
        System.out.println("Word: " + word);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read one number and one word
        int num = sc.nextInt();
        String word = sc.next();
        // Create one Printer object
        Printer p = new Printer();

        // Call both show() methods
        p.show(num);
        p.show(word);
    }
}
