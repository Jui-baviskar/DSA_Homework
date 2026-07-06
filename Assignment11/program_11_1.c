// Write a program which accept range from the user and display all numbers in between

#include<stdio.h>

void RangeDisplay(int iStart,int iEnd)
{
    int iCnt=0;
    for(iCnt=iStart;iCnt<=iEnd;iCnt++)
    {
        printf("%d ",iCnt);
    }
}

int main()
{
    int iValue1=0;
    int iValue2=0;

    printf("Enter Statrting point ");
    scanf("%d",&iValue1);

    printf("Enter Ending point ");
    scanf("%d",&iValue2);

    RangeDisplay(iValue1,iValue2);

    return 0;
}