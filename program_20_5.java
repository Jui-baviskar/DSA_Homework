class Logic {
    int findSmallestDigit(int num) {
        int iLDigit =0, iDigit = 0;
        iLDigit=num%10;

        while (num != 0) {
            iDigit = num % 10;
            if (iLDigit > iDigit) {
                iLDigit = iDigit;
            }
            num = num / 10;
        }
        return iLDigit;
    }
}

public class program_20_5 {
    public static void main(String A[]) {
        int iRet = 0;
        Logic lObj = new Logic();
        iRet = lObj.findSmallestDigit(83429);
        System.out.println("Largest " + iRet);
    }
}
