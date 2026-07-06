// Write a program which accpt one number from user and print that number of even numbers on screen

#include<stdio.h>
void PrintEven(int iNo)
{
    if(iNo<=0)
    {
        return;
    }
    
    int iValue=0;
    while(iNo>0)
    {
        iValue=iValue+2;
        printf("%d ",iValue);
        iNo--;
    }
}

int main()
{
    int iValue=0;
    printf("Enter the number ");
    scanf("%d",&iValue);
    PrintEven(iValue);
    return 0;
}
