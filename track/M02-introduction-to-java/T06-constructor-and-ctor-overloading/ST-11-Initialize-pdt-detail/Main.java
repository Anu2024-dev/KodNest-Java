
import java.util.Scanner;

class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double price = sc.nextDouble();
        Product p = new Product(name, price);
        p.display();
        sc.close();
    }
}
