//Write a program which accept range from user and display all even numbers in betwenn that range

#include<stdio.h>

void RangeDisplayEven(int iStart,int iEnd)
{
    int iCnt=0;

    for(iCnt=iStart;iCnt<=iEnd;iCnt++)
    {
        if((iCnt%2)==0)
        {
            printf("%d",iCnt);
        }
    }
}

int main()
{
    int iValue1=0;
    int iValue2=0;

    printf("Enter Starting point ");
    scanf("%d",&iValue1);

    printf("Enter Ending point ");
    scanf("%d",&iValue2);

    RangeDisplayEven(iValue1,iValue2);

    return 0;
}
