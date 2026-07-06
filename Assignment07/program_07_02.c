//Accept amount in US dollar and return its corresponding value in Indian Currency .
//Consider 1 $ as 70 rupees

#include<stdio.h>

int DollarToINR(int iNo)
{
    return iNo*70;
}

int main()
{
    int iVlaue=0;
    int iRet=0;

    printf("Enter number of USD ");
    scanf("%d",&iVlaue);

    iRet=DollarToINR(iVlaue);

    printf("Value in INR is %d",iRet);

    return 0;
}
