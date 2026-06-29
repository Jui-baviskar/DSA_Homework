class Logic{
    int productOfDigits(int num)
    {
        int iDigit=0,iProduct=1;
        while (num!=0) {
            iDigit=num%10;
            iProduct=iProduct*iDigit;
            num=num/10;
        }
        return iProduct;
    }
}
public class program_21_1 {
    public static void main(String A[])
    {
        int iRet=0;
        Logic lObj=new Logic();
        iRet=lObj.productOfDigits(123);
        System.out.println(iRet);
    }
}
