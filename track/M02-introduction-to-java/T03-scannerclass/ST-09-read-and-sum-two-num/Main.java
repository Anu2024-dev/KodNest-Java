import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        short a=sc.nextShort();
        short b=sc.nextShort();
        int sum=a+b;
        System.out.println("Sum: "+sum);
        sc.close();
    }
}

