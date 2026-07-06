package Assignment18;
import java.util.*;

class Logic{
    public void sumEvenOddDigit(int num)
    {
        int iNumber=num,iDigit=0,iSumEven=0,iSumOdd=0;
        while (iNumber!=0) {
            iDigit=iNumber%10;
            if(iDigit%2==0)
            {
                iSumEven=iSumEven+iDigit;
            }
            else{
                iSumOdd=iSumOdd+iDigit;
            }
            iNumber=iNumber/10;
        }

        System.out.println("Sum of Even is "+iSumEven);
        System.out.println("Sum of Odd is "+iSumOdd);
    }
}
public class program_18_4 {
    public static void main(String A[])
    {
        Scanner sObj=new Scanner(System.in);
        int iNo=0;

        System.out.println("Enter number ");
        iNo=sObj.nextInt();

        Logic lObj=new Logic();
        lObj.sumEvenOddDigit(iNo);

        sObj.close();
    }
}
