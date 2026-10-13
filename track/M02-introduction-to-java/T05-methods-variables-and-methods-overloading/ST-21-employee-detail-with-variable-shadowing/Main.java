
import java.util.Scanner;

class Employee {

    String name;
    double salary;

    void setDetails(String name, double salary) {
        // Store both parameters in the instance variables
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        // Print the stored name and salary
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the full name and salary
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        // Create one Employee object
        Employee e1 = new Employee();
        // Call setDetails() and displayDetails()
        e1.setDetails(name, salary);
        e1.displayDetails();
    }
}
