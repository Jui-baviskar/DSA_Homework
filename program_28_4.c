#include <stdio.h>
void Pattern(int iRow, int iCol)
{
    int i = 0, j = 0, k = 0;
    for (i = iRow; i > 0; i--)
    {
        for (j = 1; j <= iCol; j++)
        {
            if (i == j || i == 1 || i == iRow || j == iCol || j == 1)
            {
                printf("*\t");
            }
            else if(i<j)
            {
                printf("$\t");
            }
            else{
                printf("#\t");
            }
        }
        printf("\n");
    }
}
int main()
{
    int iValue1, iValue2;

    printf("Enter number of rows and columns:\n");
    scanf("%d %d", &iValue1, &iValue2);

    Pattern(iValue1, iValue2);

    return 0;
}