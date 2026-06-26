import java.util.Scanner;

public class program_15_2 {

    public static int Display(int Arr[], int iLength,int iNo) {
        int iCnt = 0,iIndex=-1;
       

        for (iCnt = 0; iCnt < iLength; iCnt++) {
            if ((Arr[iCnt]) == iNo) {
              iIndex=iCnt;
              break;
            }
        }
        return iIndex;
    }

    public static void main(String A[]) {
        Scanner sObj = new Scanner(System.in);
        int iSize = 0, iCnt = 0,iNo=0;
        int[] Arr;
        int iRet=0;

        System.out.println("Enter number of elements ");

        iSize = sObj.nextInt();
        Arr = new int[iSize];

        for (iCnt = 0; iCnt < iSize; iCnt++) {
            System.out.print("Enter the element ");
            Arr[iCnt] = sObj.nextInt();
        }

        System.out.println("Enter the element whose frequency is to be measursed");
        iNo=sObj.nextInt();

        iRet = Display(Arr, iSize,iNo);

        System.out.println(iRet);
        sObj.close();
    }
}
