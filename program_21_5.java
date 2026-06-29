class Logic{
    void printDivisibleby2and3(int n)
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=n;iCnt++)
        {
            if(iCnt%2==0 && iCnt%3==0)
            {
                System.out.print(iCnt+"\t");
            }
        }
    }
}
public class program_21_5 {
    public static void main(String A[])
    {
        Logic lObj=new Logic();
        lObj.printDivisibleby2and3(30);
    }
}
