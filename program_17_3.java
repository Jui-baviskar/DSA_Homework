import java.util.Scanner;

class Logic {
    public void Max(int iNo1,int iNo2)
    {
        if(iNo1>iNo2)
        {
            System.out.println("The Maximum number is "+iNo1);
        }
        else{
            System.out.println("The Maximum number is "+iNo2);
        }
    }
}
public class program_17_3 {
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);
        int iNo1=0,iNo2=0;

        System.out.println("Enter a first number ");
        iNo1=sobj.nextInt();

        System.out.println("Enter the second number ");
        iNo2=sobj.nextInt();

        Logic lObj=new Logic();
        lObj.Max(iNo1, iNo2);

    }
    
}
