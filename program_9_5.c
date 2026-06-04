// Write a program which accept number from user and return difference between summation of even digits and summation of odd digits.

#include<stdio.h>

int CountDiff(int iNo)
{
    if (iNo < 0)
    {
        iNo = -iNo;
    }

    int iValue = iNo;
    int iEvenCnt=0;
    int iOddCnt=0;
    int iDigit=0;

    while (iValue>0)
    {
        iDigit=iValue%10;
        if((iDigit%2)==0)
        {
            iEvenCnt=iEvenCnt+iDigit;
        }
        else{
            iOddCnt=iOddCnt+iDigit;
        }
        iValue=iValue/10;
    }
    return (iEvenCnt-iOddCnt);
}

int main()
{
    int iValue=0;
    int iRet=0;

    printf("Enter Number ");
    scanf("%d",&iValue);

    iRet=CountDiff(iValue);
    printf("%d",iRet);

    return 0;
}