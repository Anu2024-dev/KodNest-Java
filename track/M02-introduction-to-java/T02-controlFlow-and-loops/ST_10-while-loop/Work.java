
public class Work {
    public static void main(String[] args) {
        int count=1;
        while(count<=5){
            System.out.println(count);
            count++;
        }
        int number =1;
        int sum=0;
        while(number<=5){
            sum=sum+number;
        number++;
        }
        int attempt=1;
        do { 
            System.out.println("Attempts "+ attempt);
            attempt++;
        } while (attempt<=3);
        int attempts=1;
        while(attempts<=3){
            System.out.println(attempts);
            attempts++;
        }
        int cnt=5;
        do { 
            System.out.println(cnt);
        } while (cnt<5);
    }
}
