
import java.util.Scanner;

class Student {

    // Declare registrationId, name and attendancePercentage
    int regId;
    String name;
    double attp;
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create and populate firstStudent
        Student s1 = new Student();
        s1.regId = sc.nextInt();
        s1.name = sc.next();
        s1.attp = sc.nextDouble();

        // Create and populate secondStudent
        Student s2 = new Student();
        s2.regId = sc.nextInt();
        s2.name = sc.next();
        s2.attp = sc.nextDouble();

        // Read the selected ID and new attendance
        int tgId = sc.nextInt();
        double upatt = sc.nextDouble();

        Student selectedStudent = null;

        // Make selectedStudent refer to the matching existing object
        if (tgId == s1.regId) {
            selectedStudent = s1;
            s1.attp = upatt;
        } else if (tgId == s2.regId) {
            selectedStudent = s2;
            s2.attp = upatt;
        }

        if (selectedStudent != null) {
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        System.out.println(s1.regId + " - " + s1.name + " - " + s1.attp + "%");
        System.out.println(s2.regId + " - " + s2.name + " - " + s2.attp + "%");
        // Update through selectedStudent when a match exists

        // Display both records
    }
}
