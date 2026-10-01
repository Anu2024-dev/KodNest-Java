import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = scanner.nextInt();
        
        // Consume the pending newline
        // Read the complete name
        // Print the name and age
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        scanner.close();
    }
}

