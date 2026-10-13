
import java.util.Scanner;

class ResultCalculator {

    int getTotal(int first, int second) {
        // Return the total of two marks
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        // Return the total of three marks
        return first + second + third;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read three marks
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        // Create one ResultCalculator object
        ResultCalculator r1 = new ResultCalculator();
        // Call both overloaded methods and print both totals
        int res1 = r1.getTotal(n1, n2);
        int res2 = r1.getTotal(n1, n2, n3);
        System.out.println("Two-Mark Total: " + res1);
        System.out.println("Three-Mark Total: " + res2);
    }
}
