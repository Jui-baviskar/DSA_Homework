// Write a program which accept width and height of rectangle from user and calculate its area.
//Area= Width * Height

#include<stdio.h>

double RectArea(float fWidth,float fHeight)
{
    double dArea=fWidth*fHeight;
    return dArea;
}

int main()
{
    float fValue1=0.0;
    float fVlaue2=0.0;
    double dRet=0.0;

    printf("Enter Width ");
    scanf("%f",&fValue1);

    printf("Enter Height ");
    scanf("%f",&fVlaue2);

    dRet=RectArea(fValue1,fVlaue2);

    printf("The Area of Rectangle is %lf",dRet);

    return 0;
}
