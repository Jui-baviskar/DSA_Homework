import java.util.*;
class Logic{
    void printDigits(int num)
    {
        int iDigit=0,iNumber=num;

        while (iNumber!=0) {
            iDigit=iNumber%10;
            System.out.println(iDigit);
            iNumber=iNumber/10;
        }
    }
}
public class program_19_4 {
    public static void main(String A[])
    {
        Scanner sObj=new Scanner(System.in);
        int iNo=0;

        System.out.println("Enter the number ");
        iNo=sObj.nextInt();

        Logic lObj=new Logic();
        lObj.printDigits(iNo);

        sObj.close();
    }
}
