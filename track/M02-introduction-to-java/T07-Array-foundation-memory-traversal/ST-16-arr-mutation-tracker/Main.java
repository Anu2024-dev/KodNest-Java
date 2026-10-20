
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] readings = new int[n];

        for (int index = 0; index < n; index++) {
            readings[index] = sc.nextInt();
        }
        int snapshot[] = new int[readings.length];
        for (int i = 0; i < snapshot.length; i++) {
            snapshot[i] = readings[i];
        }
        int updateIndex = sc.nextInt();
        int newValue = sc.nextInt();
        readings[updateIndex] = newValue;
        //print original array;
        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }

        System.out.println();
        // Print the updated array.
        System.out.print("Updated: ");
        for (int i = 0; i < readings.length; i++) {
            System.out.print(readings[i] + " ");
        }

        sc.close();
    }
}
