import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        short a=scanner.nextShort();
        short b=scanner.nextShort();
        int sum=a+b;
        System.out.println("Sum: "+sum);
        scanner.close();
    }
}

