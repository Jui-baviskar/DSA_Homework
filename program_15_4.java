import java.util.Scanner;

public class program_15_4 {

    public static void Display(int Arr[], int iLength,int iStart,int iEnd) {
        int iCnt = 0;
       

        for (iCnt = 0; iCnt < iLength; iCnt++) {
            if ((Arr[iCnt]>=iStart) &&(Arr[iCnt] <=iEnd)) {
               System.out.print(Arr[iCnt]+"\n");
            }
        }
    }

    public static void main(String A[]) {
        Scanner sObj = new Scanner(System.in);
        int iSize = 0, iCnt = 0,iStart=0,iEnd=0;
        int[] Arr;

        System.out.println("Enter number of elements ");

        iSize = sObj.nextInt();
        Arr = new int[iSize];

        for (iCnt = 0; iCnt < iSize; iCnt++) {
            System.out.print("Enter the element ");
            Arr[iCnt] = sObj.nextInt();
        }

        System.out.println("Enter the Start ");
        iStart=sObj.nextInt();

        System.out.println("Enter the End ");
        iEnd=sObj.nextInt();

        Display(Arr, iSize,iStart,iEnd);
        System.out.println();
        sObj.close();
    }
}
