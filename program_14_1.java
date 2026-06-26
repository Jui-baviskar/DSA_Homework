import java.util.Scanner;

public class program_14_1 {

    public static int Display(int Arr[], int iLength) {
        int iCnt = 0,iECnt=0;

        System.out.println("The elements which can be divisible by 5 ");

        for (iCnt = 0; iCnt < iLength; iCnt++) {
            if ((Arr[iCnt] % 2) == 0) {
                iECnt++;
            }
        }
        return iECnt;
    }

    public static void main(String A[]) {
        Scanner sObj = new Scanner(System.in);
        int iSize = 0, iCnt = 0,iRet=0;
        int[] Arr;

        System.out.println("Enter number of elements ");

        iSize = sObj.nextInt();
        Arr = new int[iSize];

        for (iCnt = 0; iCnt < iSize; iCnt++) {
            System.out.print("Enter the element ");
            Arr[iCnt] = sObj.nextInt();
        }

        iRet= Display(Arr, iSize);

        System.out.println(iRet);
        sObj.close();
    }
}
