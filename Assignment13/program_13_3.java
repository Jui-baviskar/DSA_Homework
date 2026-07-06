package Assignment13;
import java.util.Scanner;

public class program_13_3 {

    public static void Display(int Arr[], int iLength) {
        int iCnt = 0;

        System.out.println("The elements which can be divisible by 5 and even ");

        for (iCnt = 0; iCnt < iLength; iCnt++) {
            if ((Arr[iCnt] % 5) == 0 && (Arr[iCnt]%2==0)) {
                System.out.println(Arr[iCnt]);
            }
        }
    }

    public static void main(String A[]) {
        Scanner sObj = new Scanner(System.in);
        int iSize = 0, iCnt = 0;
        int[] Arr;

        System.out.println("Enter number of elements ");

        iSize = sObj.nextInt();
        Arr = new int[iSize];

        for (iCnt = 0; iCnt < iSize; iCnt++) {
            System.out.print("Enter the element ");
            Arr[iCnt] = sObj.nextInt();
        }

        Display(Arr, iSize);

        sObj.close();
    }
}
