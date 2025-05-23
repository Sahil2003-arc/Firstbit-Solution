#include<stdio.h>
void main(){
    int i,no;
    int sum=0;
    printf("Enter the number:");
    scanf("%d",&no);

    for(i=1;i<=no;i++){
        sum=sum+i;
    }
    printf("Sum of number:%d",sum);
}