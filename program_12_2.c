// Write a program which accept number from user and check wether it contains 0 in it or not

#include<stdio.h>

#define True 1
#define False 0

typedef int BOOL;

BOOL ChkZero(int iNo)
{
    int iDigit=0;
    while (iNo>0)
    {
        iDigit=iNo%10;
        if(iDigit==0)
        {
            return True;
        }
        iNo=iNo/10;
    }
    return False;
}

int main()
{
    int iValue=0;
    BOOL bRet=False;

    printf("Enter Number ");
    scanf("%d",&iValue);

    bRet=ChkZero(iValue);

    if(bRet==True)
    {
        printf("The Number contains 0");
    }
    else{
        printf("The Number doesnt contain 0");
    }

    return 0;
}
