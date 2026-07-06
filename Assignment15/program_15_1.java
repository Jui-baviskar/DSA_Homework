package Assignment15;
import java.util.Scanner;

public class program_15_1 {

    public static boolean Display(int Arr[], int iLength,int iNo) {
        int iCnt = 0;
        boolean bPresent=false;

        for (iCnt = 0; iCnt < iLength; iCnt++) {
            if ((Arr[iCnt]) == iNo) {
              bPresent=true;
              break;
            }
        }
        return bPresent;
    }

    public static void main(String A[]) {
        Scanner sObj = new Scanner(System.in);
        int iSize = 0, iCnt = 0,iNo=0;
        int[] Arr;
        boolean bRet=false;

        System.out.println("Enter number of elements ");

        iSize = sObj.nextInt();
        Arr = new int[iSize];

        for (iCnt = 0; iCnt < iSize; iCnt++) {
            System.out.print("Enter the element ");
            Arr[iCnt] = sObj.nextInt();
        }

        System.out.println("Enter the element whose frequency is to be measursed");
        iNo=sObj.nextInt();

        bRet = Display(Arr, iSize,iNo);

        System.out.println(bRet);
        sObj.close();
    }
}
