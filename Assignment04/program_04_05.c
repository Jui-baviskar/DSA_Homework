//Write a program which accept number from user and return difference between summation of all its factors and non factors

#include<stdio.h>

int FactDiff(int iNo)
{
int iFact=0;
int iNonFact=0;
int iCnt=0;

for(iCnt=1;iCnt<iNo;iCnt++)
{
    if((iNo%iCnt)==0)
    {
        iFact=iFact+iCnt;
    }
    else{
        iNonFact=iNonFact+iCnt;
    }    
}
return iFact-iNonFact;
}

int main()
{
    int iValue=0;
    int iRet=0;

    printf("Enter Number ");
    scanf("%d",&iValue);

    iRet=FactDiff(iValue);
    printf("%d",iRet);

    return 0;
}
