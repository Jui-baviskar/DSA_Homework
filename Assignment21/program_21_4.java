package Assignment21;
class Logic{
    void countFactors(int num) {
        int iCnt = 0,iCount=0;
        for (iCnt = 1; iCnt <= (num / 2); iCnt++) {
            if (num % iCnt == 0) {
                iCount++;
            }
        }
        System.out.println("Count of Factors "+iCount);
    }
    
}
public class program_21_4 {
    public static void main(String [] A)
    {
        Logic lObj=new Logic();
        lObj.countFactors(20);
    }
}
