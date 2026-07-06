package Assignment21;
class Logic{
    void countEvenOddRange(int n)
    {
        int iCnt=0,iCountEven=0,iCountOdd=0;

        for(iCnt=1;iCnt<=n;iCnt++)
        {
            if(iCnt%2==0)
            {
                iCountEven++;
            }
            else{
                iCountOdd++;
            }
        }

        System.out.println("Even : "+iCountEven);
        System.out.println("Odd  : "+iCountOdd);
    }
}
public class program_21_2 {
    public static void main(String A[])
    {
        Logic lObj=new Logic();
        lObj.countEvenOddRange(50);
    }
}
