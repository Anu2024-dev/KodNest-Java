
import java.util.Scanner;

class NumberUtility {

    int getLarger(int first, int second) {
        // Return larger number
        if (first > second) {
            return first; 
        }else if (second > first) {
            return second;
        }
        return first;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        NumberUtility n = new NumberUtility();
        // Call method
        int lrg = n.getLarger(first, second);
        // Print result
        System.out.println(lrg);
    }
}
