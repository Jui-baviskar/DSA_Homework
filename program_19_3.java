import java.util.*;
class Logic{
    public void checkDivisible(int num)
    {
        if((num%5==0) && (num%11==0))
        {
            System.out.println("The number is divisible by 5 and 11");
        }
        else{
            System.out.println("The number is not divisible ");
        }
    }
}
public class program_19_3 {
    public static void main(String A[])
    {
        Scanner sObj=new Scanner(System.in);
        int iNo=0;

        System.out.println("Enter a number ");
        iNo=sObj.nextInt();

        Logic lObj=new Logic();
        lObj.checkDivisible(iNo);
        sObj.close();
    }
}
