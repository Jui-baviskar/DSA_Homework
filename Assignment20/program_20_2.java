package Assignment20;
class Logic{
    void printReverse(int n)
    {
        int iCnt=0;
        for(iCnt=n;iCnt>=1;iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}
public class program_20_2 {
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.printReverse(10);
    }
}
