#include<stdio.h>
void main()
{
    int i;
    int arr[10],brr[5],crr[7];
    printf("Enter the value of arr: ",i);
    for(int i=0;i<10;i++)
    {  
        scanf("%d",&arr[i]);
    }
    for(int j=0;j<5;j++)
    {
        printf("Enter the value of brr[%d]: ",j);
        scanf("%d",&brr[j]);
    }
    for(int k=0;k<7;k++)
    {
        printf("Enter the value of crr[%d]: ",k);
        scanf("%d",&crr[k]);
    }
    printf("The values of arr are: ");
    for(int i=0;i<10;i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\nThe values of brr are: ");
    for(int j=0;j<5;j++)
    {
        printf("%d ",brr[j]);
    }
    printf("\nThe values of crr are: ");
    for(int k=0;k<7;k++)
    {
        printf("%d ",crr[k]);
    }
    printf("\n"); 

}