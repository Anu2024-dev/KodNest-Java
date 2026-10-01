import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Read and display the profile
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Learner: "+name);
        int solvedProblems=sc.nextInt();
        System.out.println("Problems solved: "+solvedProblems);
        double ass=sc.nextDouble();
        System.out.println("Assessment: "+ass);
        sc.close();
    }
}

