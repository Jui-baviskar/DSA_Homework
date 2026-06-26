import java.util.Scanner;

public class program_14_3 {

    public static boolean Display(int Arr[], int iLength) {
        int iCnt = 0;
        boolean bPresent=false;

        System.out.println("The elements which can be divisible by 5 ");

        for (iCnt = 0; iCnt < iLength; iCnt++) {
            if ((Arr[iCnt] % 11) == 0) {
                bPresent=true;
                break;
            } 
        }
        return bPresent;
    }

    public static void main(String A[]) {
        Scanner sObj = new Scanner(System.in);
        int iSize = 0, iCnt = 0;
        boolean bRet=false;
        int[] Arr;

        System.out.println("Enter number of elements ");

        iSize = sObj.nextInt();
        Arr = new int[iSize];

        for (iCnt = 0; iCnt < iSize; iCnt++) {
            System.out.print("Enter the element ");
            Arr[iCnt] = sObj.nextInt();
        }

        bRet = Display(Arr, iSize);
        if(bRet==false)
        {
            System.out.println("11 Not Present ");
        }
        else{
            System.out.println("11 is Present ");
        }
        sObj.close();
    }
}
