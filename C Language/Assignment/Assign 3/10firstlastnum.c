#include<stdio.h>
void main(){
    int no,sum=0;
    printf("Enter the number:");
    scanf("%d",&no);

    int i;
    int a=no%10;

    while(no>10)
    {
         no=no/10;
    }
    sum=a+no;
    printf("sum of number:%d",sum);
    
}