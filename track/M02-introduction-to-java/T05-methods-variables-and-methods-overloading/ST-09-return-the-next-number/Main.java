
import java.util.Scanner;

class NumberUtility {

    int getNextNumber(int number) {
        // Return next number
        return number + 1;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Create object
        NumberUtility n1 = new NumberUtility();
        // Call method
        int nextNum = n1.getNextNumber(number);
        // Print result
        System.out.println(nextNum);
    }
}
