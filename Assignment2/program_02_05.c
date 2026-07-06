//Check if the number is even or odd
#include<stdio.h>
#define TRUE 1
#define FALSE 2

typedef int BOOL;

BOOL ChkEven(int iNO)
{
    if(iNO%2==0)
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
    
    printf("Please enter Number ");
    scanf("%d",&iValue);

    bRet=ChkEven(iValue);
    
    if(bRet==TRUE)
    {
        printf("The number is Even ");
    }
    else{
        printf("The number is odd ");
    }
    return 0;
}
