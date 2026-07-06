//Write a program which accept distance in kilometer and convert it into meter(1 kilometer=1000 meter)

#include<stdio.h>

int KMtoMeter(int iNo)
{
    return iNo*1000;
}

int main()
{
    int iValue=0;
    int iRet=0;

    printf("Enter Distance ");
    scanf("%d",&iValue);

    iRet=KMtoMeter(iValue);

    printf("The Distance is meter is %d",iRet);

    return 0;
}