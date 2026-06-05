// Write a program which accept temperature in Fahrenheit and convert it into celcius(1 celcius=(Fahrenheit-32)*(5/9))

#include<stdio.h>

double FhtoCs(float fTemp)
{
    return ((fTemp-32)*(5.0/9.0));
}

int main()
{
    float fValue=0.0;
    double dRet=0.0;

    printf("Enter Temperature ");
    scanf("%f",&fValue);

    dRet=FhtoCs(fValue);

    printf("The Temperature in celcuis is %lf",dRet);

    return 0;
}