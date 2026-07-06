

package Assignment20;
class Logic{
    int findLargestDigit(int num)
    {
        int iLDigit=0,iDigit=0;

        while (num!=0) {
            iDigit=num%10;
            if(iLDigit<iDigit)
            {
                iLDigit=iDigit;
            }
            num=num/10;
        }
        return iLDigit;
    }
}
public class program_20_4 {
    public static void main(String A[])
    {
        int iRet=0;
        Logic lObj=new Logic();
        iRet=lObj.findLargestDigit(83429);
        System.out.println("Largest "+iRet);
    }
}
