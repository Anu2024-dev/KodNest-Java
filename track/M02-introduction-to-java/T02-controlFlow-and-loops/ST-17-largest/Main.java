public class Main {
    public static void main(String[] args) {
        int first = 25;
        int second = 40;
        int great=first;
        
        // Compare the two values
        if(first>second){
            great=first;
        }else{
            great=second;
        }
        System.out.println("Larger: "+great);
    }
}
