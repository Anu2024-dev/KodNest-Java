import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read product name
        // Read price
        // Read quantity
        // Calculate and print the total
        String pdtnme=sc.next();
        double price=sc.nextDouble();
        int qnty=sc.nextInt();
        double totalBill=price*qnty;
        System.out.println("Product: "+pdtnme);
        System.out.println("Total: "+totalBill);
        sc.close();
    }
}
