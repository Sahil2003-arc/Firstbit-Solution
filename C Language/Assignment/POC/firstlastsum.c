#include<stdio.h>
void main(){
    int s,sl,temp,sum,no;

    printf("Enter the number:");
    scanf("%d",&no);
    temp = no/10;
    sl = temp % 10;

    while(no>10)
    {
        s=no % 10;
        no=no / 10;
    }
    sum=s+sl;
    printf("sum of altenate second & second last number:%d",sum);
}