import java.util.Scanner;

class  Logic{
    void checkPerfect(int num)
    {
        int iCnt=0;
        int iSum=0;

        for(iCnt=1;iCnt<num;iCnt++)
        {
            if(num%iCnt==0)
            {
                iSum=iSum+iCnt;
            }
        }

        if(iSum==num)
        {
            System.out.println("The number is a Perfect number ");
        }
        else{
            System.out.println("The number is not prefect number ");
        }

    }
}
public class program_20_3 {
    public static void main(String A[])
    {
        Scanner sObj=new Scanner(System.in);
        int iNo=0;
        System.out.println("Enter a number ");
        iNo=sObj.nextInt();

        Logic lObj=new Logic();
        lObj.checkPerfect(iNo);
        sObj.close();
    }
}
