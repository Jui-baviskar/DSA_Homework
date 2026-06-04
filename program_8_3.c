// Write a program which accepts distance in kilometer and convert it into meter (1 kilometer=100 Meter)

#include<stdio.h>

int KMtoMeter(int iNo)
{
    return(iNo*100);
}

int main()
{
    int iValue=0;
    int iRet=0;

    printf("Enter Distance ");
    scanf("%d",&iValue);

    iRet=KMtoMeter(iValue);

    printf("The Distance in meter is %d",iRet);
    return 0;
}