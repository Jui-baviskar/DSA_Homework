// Write a program which accept area in sqaure feet and convert it into sqaure meter(1 square feet=0.0929   Square meter )

#include<stdio.h>

double SquareMeter(int iValue)
{
    return (iValue*0.0929);
}

int main()
{
    int iValue=0;
    double dRet=0.0;

    printf("Enter area in square feet ");
    scanf("%d",&iValue);

    dRet=SquareMeter(iValue);

    printf("The Area in sqare meter is %lf",dRet);

    return 0;
}