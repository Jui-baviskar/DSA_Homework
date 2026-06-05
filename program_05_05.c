//Write a program which accept N and print first 5 multiples of N 

#include<stdio.h>

void MultipleDisplay(int iNo)
{
    int iCnt=0;
    for(iCnt=1;iCnt<=(iNo+1);iCnt++)
    {
        printf("%d ",(iCnt*iNo));
    }
}

int main()
{
    int iValue=0;
    
    printf("Enter Number ");
    scanf("%d",&iValue);

    MultipleDisplay(iValue);
    return 0;
}
