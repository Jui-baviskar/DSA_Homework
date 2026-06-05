//Write a program which accept range from user and return addition of all numbers in beyween that range.(Range should contain positive numbers only )

#include <stdio.h>

void RangeDisplayEven(int iStart, int iEnd)
{
    if((iStart<0) || (iEnd<0))
    {
        return;
    }
    int iCnt = 0;

    for (iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        if ((iCnt % 2) == 0)
        {
            printf("%d", iCnt);
        }
    }
}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;

    printf("Enter Starting point ");
    scanf("%d", &iValue1);

    printf("Enter Ending point ");
    scanf("%d", &iValue2);

    RangeDisplayEven(iValue1, iValue2);

    return 0;
}
