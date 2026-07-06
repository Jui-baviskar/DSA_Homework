package Assignment20;
class Logic {
    void sumEvenNumbers(int n)
    {
        int iCnt=0;
        int iSum=0;
        for(iCnt=1;iCnt<=n;iCnt++)
        {
            if(iCnt%2==0)
            {
                iSum+=iCnt;
            }
        }
        System.out.println("The sum of even noumbers is "+iSum);
    }
    
}
public class program_20_1 {
  public static void main(String A[])
  {
    Logic lobj=new Logic();
    lobj.sumEvenNumbers(10);
  }  
}
