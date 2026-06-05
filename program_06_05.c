//Write a programm which accept number from user and display its in reverse

#include<stdio.h>

void TableRev(int iNo)
{
    int iCnt=0;

    for(iCnt=10;iCnt>0;iCnt--)
    {
        printf("%d ",(iCnt*iNo));
    }
}

int main()
{
    int iValue=0;

    printf("Enter Number ");
    scanf("%d",&iValue);

    TableRev(iValue);
    return 0;
}
