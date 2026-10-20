
import java.util.Scanner;

class Course {

    String name;
    int dur;

    Course() {
        this("Java", 30);
    }

    Course(String name, int dur) {
        this.name = name;
        this.dur = dur;
    }

    void display() {
        System.out.println(name + " " + dur);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int dur = sc.nextInt();
        Course c1 = new Course();
        c1.display();
        Course c2 = new Course(name, dur);
        c2.display();
        sc.close();
    }
}
