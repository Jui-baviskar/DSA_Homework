import java.util.*;
class Logic{
    public void checkSign(int num)
    {
        if(num<0)
        {
            System.out.println("The number is negative");
        }
        else if(num==0)
        {
            System.out.println("The number is zero ");
        }
        else{
            System.out.println("The number is positive ");
        }
    }
}
public class program_18_5 {
    public static void main(String A[])
    {
        Scanner sObj=new Scanner(System.in);
        int iNo=0;

        System.out.println("Enter element ");
        iNo=sObj.nextInt();

        Logic lObj=new Logic();
        lObj.checkSign(iNo);

        sObj.close();
    }
}
