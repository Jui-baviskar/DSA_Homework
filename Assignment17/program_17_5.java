package Assignment17;
import java.util.Scanner;

class Logic{
    public void Table(int num)
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=10;iCnt++)
        {
            System.out.println(num*iCnt);
        }
    }
}
public class program_17_5 {
    public static void main(String A[])
    {
        Scanner sObj=new Scanner(System.in);
        int iNo=0;

        System.out.println("Enter the number ");
        iNo=sObj.nextInt();

        Logic lObj=new Logic();
        System.out.println("The table of "+iNo+" is ");
        lObj.Table(iNo);

        sObj.close();
    }
}
