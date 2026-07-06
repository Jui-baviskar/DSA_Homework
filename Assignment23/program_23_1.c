#include<stdio.h>

void Pattern(int iRow,int iCol)
{
    int i=0,j=0;

    for(i=1;i<=iRow;i++)
    {
        for(j=1;j<=iCol;j++)
        {
            printf("* \t");
        }
        printf("\n");
    }
}

int main()
{
    int iValue1=0,iVlaue2=0;

    printf("Enter number of rows and columns : \n");
    scanf("%d %d",&iValue1,&iVlaue2);

    Pattern(iValue1,iVlaue2);
    return 0;
}