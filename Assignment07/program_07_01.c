//Write a program which accept number from user and display below pattern

#include<stdio.h>

void Display(int iNo)
{
    int iCnt=0;
    for(iCnt=1;iCnt<=iNo;iCnt++)
    {
        printf("* ");
    }
    for (iCnt=1;iCnt<=iNo;iCnt++)
    {
        printf("# ");
    }
}

int main()
{
    int iVlaue=0;

    printf("Enter number ");
    scanf("%d",&iVlaue);

    Display(iVlaue);

    return 0;
}
