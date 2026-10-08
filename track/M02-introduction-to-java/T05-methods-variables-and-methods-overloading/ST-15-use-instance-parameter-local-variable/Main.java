
import java.util.Scanner;

class Student {

    int mark;

    void showFinalMark(int bonus) {
        int finalmark;
        finalmark = bonus + mark;
        System.out.println(mark);
        System.out.println(finalmark);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.mark = sc.nextInt();
        int bonus = sc.nextInt();
        s.showFinalMark(bonus);
        sc.close();
    }
}
