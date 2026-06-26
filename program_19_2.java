import java.util.*;

class Logic {
    public void checkGrade(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        } else if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}

public class program_19_2 {
    public static void main(String A[]) {
        Scanner sObj = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sObj.nextInt();

        Logic lObj = new Logic();
        lObj.checkGrade(marks);

        sObj.close();
    }
}