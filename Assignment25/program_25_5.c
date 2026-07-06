#include <stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0, j = 0,icount=0;
   
    for (i = 1; i <= iRow; i++)
    {
        icount = i;
        for (j = 1; j <= iCol; j++)
        {
           printf("%d\t",icount);
           icount++;
            
        }
        printf("\n");
       
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter number of rows and columns :\n");
    scanf("%d %d", &iValue1, &iValue2);

    Pattern(iValue1, iValue2);

    return 0;
}