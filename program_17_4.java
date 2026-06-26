import java.util.Scanner;

class Logic {
    public void Minimum(int iNo1,int iNo2,int iNo3)
    {
        if(iNo1<iNo2 && iNo1<iNo3)
        {
            System.out.println("The minimun number is "+iNo1);
        }
        else if(iNo2<iNo1 && iNo2<iNo3)
        {
            System.out.println("The minimun number is " + iNo2);
        }
        else{
            System.out.println("The minimun number is " + iNo3);
        }
    }
}
public class program_17_4 {
    public static void main(String A[])
    {
       Scanner sobj=new Scanner(System.in);
        int iNo1=0,iNo2=0,iNo3=0;

        System.out.println("Enter a first number ");
        iNo1=sobj.nextInt();

        System.out.println("Enter the second number ");
        iNo2=sobj.nextInt(); 

        System.out.println("Enter the third number ");
        iNo3 = sobj.nextInt();

        Logic lObj = new Logic();
        lObj.Minimum(iNo1, iNo2, iNo3);

        sobj.close();
    }
}
