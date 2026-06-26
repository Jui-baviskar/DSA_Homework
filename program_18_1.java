import java.util.*;
class Logic {
    public void checkPrime(int num)
    {
        int iCnt=0;
        int iCount=0;
        for(iCnt=1;iCnt<=num;iCnt++)
        {
            if(num%iCnt==0)
            {
                iCount++;
            }
        }

        if(iCount==2)
        {
            System.out.println("The number is Prime ");
        }
        else{
            System.out.println("The number is not a Prime "); 
        }
    }
}
public class program_18_1 {
  public static void main(String A[])
  {
    Scanner sobj=new Scanner(System.in);
    int iNo=0;

    System.out.println("Enter number ");
    iNo=sobj.nextInt();

    Logic lObj=new Logic();
    lObj.checkPrime(iNo);

    sobj.close();
  }  
}
