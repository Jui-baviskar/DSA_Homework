class Logic{
    void displayFactors(int num)
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=(num/2);iCnt++)
        {
            if(num%iCnt==0)
            {
                System.out.print(iCnt+"\t");
            }
        }
    }
}
public class program_21_3 {
    public static void main(String A[])
    {
        Logic lObj=new Logic();
        lObj.displayFactors(12);
    }
}
