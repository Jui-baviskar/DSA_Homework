import java.util.Scanner;

class Logic {

    void sumOfDigits(int num)
    {
        int iDigit=num, iNumber = 0, iSum = 0;
        while (iDigit!=0) {
            iNumber=iDigit%10;
            iSum=iSum+iNumber;
            iDigit=iDigit/10;
        }
        System.out.println(iSum);

    }
}
public class program_17_1 {
    public static void main(String A[])
    {
        Scanner sObj=new Scanner(System.in);
        int iNo=0;

        System.out.println("Enter the Number ");
        iNo=sObj.nextInt();

        Logic lObj=new Logic();
        lObj.sumOfDigits(iNo);
        
        sObj.close();
    }
}
