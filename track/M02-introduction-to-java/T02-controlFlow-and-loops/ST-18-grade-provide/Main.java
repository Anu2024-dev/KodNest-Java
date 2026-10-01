public class Main {
    public static void main(String[] args) {
        int marks = 76;
        char grade='A';
        // Display the correct grade
        if(marks>=80) grade='A';
        else if(marks>=60 && marks<=79) grade='B';
        else if(marks>=40 && marks<=59) grade='C';
        else grade='F';
        System.out.println("Grade: "+grade);
    }
}
