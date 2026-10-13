
import java.util.Scanner;

class Result {

    void show(int mark) {
        // Declare message in the correct place
        String msg;

        if (mark >= 60) {
            msg = "Eligible";
        } else {
            msg = "Keep Practising";
        }

        System.out.println(msg);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mark = scanner.nextInt();

        Result result = new Result();
        result.show(mark);

        scanner.close();
    }
}
