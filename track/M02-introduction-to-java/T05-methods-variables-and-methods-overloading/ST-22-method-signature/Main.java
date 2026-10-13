
import java.util.Scanner;

// Online Java Compiler (Editor)
// Write and run Java online using this editor.
// class Farmer {
//     public static void main(String[] args) {
//         Cow c = new Cow();
//         Grass g = new Grass();
//         c.eat(g);
//         Milk mi = c.give();
//         System.out.println(mi);
//     }
// }
// class Cow {
//     void eat(Grass g) {
//         System.out.println("cow eats grass");
//     }
//     Milk give() {
//         Milk m = new Milk();
//         return m;
//     }
// }
// class Milk {
// }
// class Grass {
// }
class Mobileplan {

    String planname;
    int price;

    Mobileplan() {
        planname = "Basic";
        price = 199;
    }

    Mobileplan(String planname, int price) {
        this.planname = planname;
        this.price = price;
    }

    void show() {
        System.out.println("planname: " + planname + "price: " + price);
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobileplan mp1 = new Mobileplan();
        mp1.show();
        String planname = sc.nextLine();
        int price = sc.nextInt();
        Mobileplan mp2 = new Mobileplan(planname, price);
        mp2.show();
    }
}
