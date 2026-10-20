
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }
        int updateIndex = sc.nextInt();
        int updatedValue = sc.nextInt();
        int requestedIndex = sc.nextInt();

        int[] snapshot = new int[original.length];
        // Copy every element into snapshot.
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }
        int[] liveView = original;
        // Update through liveView.
        liveView[updateIndex] = updatedValue;
        // Display original, snapshot and the reference comparison.
        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println("");
        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }
        System.out.println("");
        if (liveView == original) {
            System.out.println("Same object: true");
        } else {
            System.out.println("Same object: false");
        }
        // Validate requestedIndex before accessing original.
        if ((requestedIndex > (original.length) - 1) || requestedIndex < 0) {
            System.out.println("Requested value: Invalid index");
        } else {
            System.out.println("Requested value: " + original[requestedIndex]);
        }
    }
}
