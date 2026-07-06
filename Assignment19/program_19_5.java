package Assignment19;
class Logic{
    public void calculatePower(int iBase,int iExp)
    {
        int iCnt=0;
        int iPower=iBase;
        for(iCnt=1;iCnt<iExp;iCnt++)
        {
            iPower=iPower*iBase;
        }
        System.out.println(iPower);
    }
}
public class program_19_5 {
    public static void main(String A[])
    {
        Logic lObj=new Logic();
        lObj.calculatePower(2, 5);
    }
}
