//Accept a number and check wheteher divisible by 5 or not

#include<stdio.h>

typedef int BOOL;
#define TRUE 1
#define FALSE 0

BOOL Check(int iNo)
{
    if((iNo%5)==0)
    {
        return TRUE;
    }
    else{
        return FALSE;
    }
}

int main()
{
    int iValue=0;
    BOOL bRet=FALSE;

    bRet=Check(iValue);

    if(bRet==TRUE)
    {
        printf("The Number is divisible by 5");
    }
    else{
        printf("Th number is not divisble by 5");
    }
    
    return 0;
}
