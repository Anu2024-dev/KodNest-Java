import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the range and analyze its numbers
        
        int start=sc.nextInt();
        int end=sc.nextInt();
        int evenSum=0;
        int oddcnt=0;
        
        for(int i=start;i<=end;i++){
            if(i%2==0) evenSum+=i;
            else if(i%2==1) oddcnt++;
        }
        
        System.out.println("Even sum: "+evenSum);
        System.out.println("Odd count: "+oddcnt);
        sc.close();
    }
}
