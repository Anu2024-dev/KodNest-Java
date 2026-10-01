import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of days
        // Calculate the total and display the progress status
        
        int days=sc.nextInt();
        int totalprb=0;
        
        for(int i=0;i<days;i++){
            totalprb+=sc.nextInt();
        }
        
        String status;
        if ( totalprb >= 20) {
            status="Strong progress";
        } else if(totalprb>=10 && totalprb<=19){
            status="Keep improving";
        } else {
            status="Needs more practice";
        }
        
        System.out.println("Total solved: "+totalprb);
        System.out.println("Status: "+status);
        
        sc.close();
    }
}
