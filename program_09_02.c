//  Wite a program which accept number from user and return the count of odd digits

#include<stdio.h>

int CountOdd(int iNo)
{
    if (iNo < 0)
    {
        iNo = -iNo;
    }

    int iValue = iNo;
    int iCnt = 0;
    int iDigit = 0;

    while (iValue > 0)
    {
        iDigit = iValue % 10;
        if (iDigit % 2 != 0)
        {
            iCnt = iCnt + 1;
        }
        iValue = iValue / 10;
    }
    return iCnt;
}

int main()
{
    int iValue=0;
    int iRet=0;

    printf("Enter Number ");
    scanf("%d",&iValue);

    iRet=CountOdd(iValue);

    printf("%d",iRet);

    return 0;
}
