//Write a program which accept number from user and return multiplication of all digits

#include<stdio.h>

int MultDigits(int iNo)
{
    if (iNo < 0)
    {
        iNo = -iNo;
    }

    int iValue = iNo;
    int iMulti = 1;
    int iDigit = 0;

    while (iValue>0)
    {
        iDigit=iValue%10;
        iMulti=iMulti*iDigit;
        iValue=iValue/10;
    }
    return iMulti;
}

int main()
{
    int iValue=0;
    int iRet=0;

    printf("Enter Number ");
    scanf("%d",&iValue);

    iRet=MultDigits(iValue);

    printf("%d",iRet);

    return 0;
}
