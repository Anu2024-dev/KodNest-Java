package track.M02-introduction-to-java.T02-controlFlow-and-loops.ST-Homework;

public class Home {
    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        // 1. Ternary operator with compound condition
        String message = (marks >= 60 && attendance >= 75) ? "Placement Ready" : "Continue Preparation";
        
        // 2. Print the selected message
        System.out.println(message);

        // 3. Use a for loop to display every planned practice day from 1 through practiceDays
        for (int i = 1; i <= practiceDays; i++) {
            System.out.println("Practice Day: " + i);
        }
    }
}

