import java.util.Scanner;

class Logic {

    public boolean CheckPalindrome(int num)
    {
        int itemp=0,iDigit=num,iNumber=0;
        
        while (iDigit!=0) {
            iNumber=iDigit%10;
            itemp=(itemp*10)+iNumber;
            iDigit=iDigit/10;
        }
        
        if(itemp==num)
        {
            return true;
        }
        return false;
    }
    
}
public class program_17_2 {
    public static void main(String A[])
    {
        Scanner sObj=new Scanner(System.in);
        int iNo=0;
        boolean bRet=false;

        System.out.println("Enter the number ");
        iNo=sObj.nextInt();

        Logic lObj=new Logic();
        bRet=lObj.CheckPalindrome(iNo);
        if(bRet==true)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        sObj.close();
    }
}
