// Write a program which accept radius of circle and from user and calculate its area.Consider value of PI as 3.14 (Area=PI*Radius*Radius)

#include<stdio.h>

double CircleArea(float fRadius)
{
    return (3.14*fRadius*fRadius);
}

int main()
{
    float fValue=0.0;
    double dRet=0.0;

    printf("Enter Radius ");
    scanf("%f",&fValue);

    dRet=CircleArea(fValue);

    printf("Area of Circle %f",dRet);

    return 0;
}

