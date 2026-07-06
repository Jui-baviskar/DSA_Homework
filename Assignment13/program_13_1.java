package Assignment13;
//Accept N numbers from user and return difference between the summation of even and summation of odd

import java.util.*;

class program_13_1 {
    public static int Difference(int Arr[], int iLength) {
        int iEvenSum = 0;
        int iOddSum = 0;
        int iCnt = 0;

        for (iCnt = 0; iCnt < iLength; iCnt++) {
            if ((Arr[iCnt] % 2) == 0) {
                iEvenSum = iEvenSum + Arr[iCnt];
            } else {
                iOddSum = iOddSum + Arr[iCnt];
            }
        }
        return iEvenSum - iOddSum;
    }

    public static void main(String A[]) {
        Scanner sObj = new Scanner(System.in);
        int iSize = 0, iRet = 0, iCnt = 0;
        int[] Arr;

        System.out.println("Enter number of elements ");

        iSize = sObj.nextInt();
        Arr = new int[iSize];

        for (iCnt = 0; iCnt < iSize; iCnt++) {
            System.out.print("Enter the element ");
            Arr[iCnt] = sObj.nextInt();
        }

        iRet = Difference(Arr, iSize);

        System.out.println("Result is " + iRet);

        sObj.close();
    }
}