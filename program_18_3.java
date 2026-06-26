import java.util.*;

class Logic {
    public void printEvenNumbers(int n) {
        int iCnt = 0;

        System.out.println("All the even numbers upto " + n + " are");
        for (iCnt = 1; iCnt <= n; iCnt++) {
            if (iCnt % 2 == 1) {
                System.out.println(iCnt);
            }
        }
    }
}

public class program_18_3 {
    public static void main(String A[]) {
        Scanner sObj = new Scanner(System.in);
        int iNo = 0;

        System.out.println("Enter a number ");
        iNo = sObj.nextInt();

        Logic lObj = new Logic();
        lObj.printEvenNumbers(iNo);

        sObj.close();
    }
}
