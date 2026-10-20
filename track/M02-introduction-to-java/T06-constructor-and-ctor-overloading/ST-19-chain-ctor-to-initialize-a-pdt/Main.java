
import java.util.Scanner;

class Product {

    String name;
    double price;

    Product() {
        this("Unknown", 0.0);
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " " + price);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double price = sc.nextDouble();
        Product p1 = new Product();
        p1.display();
        Product p2 = new Product(name, price);
        p2.display();
        sc.close();
    }
}
