package Assignment19;
import java.util.*;
class Logic{
    public void checkLeapYear(int year)
    {
        if(((year%4==0 )&& (year%100!=0)) || (year%400==0))
        {
            System.out.println("The year is Leap Year");
        }
        else{
            System.out.println("The year is not a leap year");
        }
    }
}
public class program_19_1 {
    public static void main(String A[])
    {
        Scanner sObj=new Scanner(System.in);
        int iYear=0;

        System.out.println("Enter a year ");
        iYear=sObj.nextInt();

        Logic lObj=new Logic();
        lObj.checkLeapYear(iYear);

        sObj.close();
    }
}
