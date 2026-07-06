//Write a program which accept range from user and returm addition of all even nu,bers in between that range (Range should contains positive numbers only )

#include <stdio.h>

int RangeSumEven(int iStart, int iEnd)
{
    if ((iStart < 0) || (iEnd < 0))
    {
        return;
    }
    int iCnt = 0;
    int iSum=0;

    for (iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        if ((iCnt % 2) == 0)
        {
            iSum=iCnt+iSum;
        }
    }

    return iSum;
}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;
    int iRet=0;

    printf("Enter Starting point ");
    scanf("%d", &iValue1);

    printf("Enter Ending point ");
    scanf("%d", &iValue2);

    iRet=RangeSumEven(iValue1, iValue2);

    printf("Addition is %d",iRet);

    return 0;
}
