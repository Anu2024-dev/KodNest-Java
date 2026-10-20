
import java.util.Scanner;

class MobilePlan {

    String planName;
    int price;

    MobilePlan() {
        planName = "Basics";
        price = 199;
    }

    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", price: " + price);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String planName = sc.nextLine();
        int price = sc.nextInt();
        MobilePlan mp1 = new MobilePlan();
        mp1.display();
        MobilePlan mp2 = new MobilePlan(planName, price);
        mp2.display();
        sc.close();
    }
}
