
import java.util.Scanner;

class FoodOrder {

    String item;
    int quantity;

    FoodOrder(String item) {
        this.item = item;
        quantity = 1;
    }

    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item = sc.nextLine();
        int quantity = sc.nextInt();
        FoodOrder f1 = new FoodOrder(item);
        f1.display();
        FoodOrder f2 = new FoodOrder(item, quantity);
        f2.display();
        sc.close();
    }
}
