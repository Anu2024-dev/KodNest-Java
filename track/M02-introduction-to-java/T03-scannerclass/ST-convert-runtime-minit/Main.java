
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read total minutes
        // Calculate hours and remaining minutes
        // Print both results
        int min = sc.nextInt();
        int h = min / 60;
        int remMin = min % 60;
        System.out.println("Hours: " + h);
        System.out.println("Minutes: " + remMin);

        sc.close();
    }
}
