
import java.util.*;

class program_16_5 {
    public static void Digits(int Arr[], int iLength) {
    
        int iCnt=0,iDigit=0,iSum=0,iNumber;

        for (iCnt = 0; iCnt < iLength; iCnt++) {
            iDigit=Arr[iCnt];
            iSum=0;

            while (iDigit!=0) {
                iNumber = iDigit % 10;
                iSum = iSum + iNumber;
                iDigit = iDigit / 10;
            }
                
            System.out.println(iSum);
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

        Digits(Arr, iSize);

        

        sObj.close();
    }
}