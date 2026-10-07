
import java.util.Scanner;

class Number {

    double largestNumber(double a, double b) {

        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return a;   // both are equal
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        // create object
        Number n = new Number();

        // call method
        double largest = n.largestNumber(a, b);

        // print result
        System.out.println("Largest: " + largest);
    }
}
