//Write program which accept number from user and return the count of digits in between 3 and 7

#include<stdio.h>

int CountRange(int iNo)
{
    if (iNo < 0)
    {
        iNo = -iNo;
    }

    int iValue = iNo;
    int iCnt = 0;
    int iDigit = 0;

    while (iValue>0)
    {
        iDigit=iValue%10;
        if((iDigit>3) && (iDigit<=7))
        {
            iCnt=iCnt+1;
        }

        iValue=iValue/10;
    }

    return iCnt;
}

int main()
{
    int iValue=0;
    int iRet=0;

    printf("Enter number ");
    scanf("%d",&iValue);

    iRet=CountRange(iValue);

    printf("%d",iRet);

    return 0;
}
