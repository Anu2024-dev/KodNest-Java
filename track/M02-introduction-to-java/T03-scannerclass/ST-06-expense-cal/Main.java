import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read income and expenses
        // Calculate and display the budget details
        double monthlyIncome=sc.nextDouble();
        double rentExpense=sc.nextDouble();
        double foodExpense=sc.nextDouble();
        double travelExpense=sc.nextDouble();
        
        double totalExpense=rentExpense+foodExpense+travelExpense;
        double remainingAmount=monthlyIncome-totalExpense;
        String status;
        if(remainingAmount>=0) status="Within budget";
        else status="Over budget";
        
        System.out.println("Total expense: "+totalExpense);
        System.out.println("Remaining: "+remainingAmount);
        System.out.println("Status: "+status);
        sc.close();
    }
}

