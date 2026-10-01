import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the learner details
        // Calculate and display the progress summary
        String name=sc.nextLine();
        int pracDays=sc.nextInt();
        int prbcnt=0;
        
        for(int i=0;i<pracDays;i++){
            prbcnt+=sc.nextInt();
        }
        
        double avg=prbcnt/pracDays;
        String status;
        
        if(avg>=5.0) status="Consistent";
        else status="Needs consistency";
        
        System.out.println("Learner: "+name);
        System.out.println("Total solved: "+prbcnt);
        System.out.println("Daily average: "+avg);
        System.out.println("Status: "+status);
        sc.close();
    }
}
