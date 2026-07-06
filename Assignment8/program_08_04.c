//Write A program which accept temperature in Fahrenheit and convert it into celius(1 Celius =(Fahrenit-32)*(5/9))

#include<stdio.h>

double FhtoCs(float fTemp)
{
    return ((fTemp-32)*(5.0/9.0));
}

int main()
{
    float fValue=0.0;
    double dRet=0.0;

    printf("Enter temperature in Fahrenheit ");
    scanf("%f",&fValue);

    dRet=FhtoCs(fValue);

    printf("The temperature in celius is %f",dRet);

    return 0;
}
