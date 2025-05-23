#include<stdio.h>
void main(){
    int no,fact=1;
    printf("Enter the number:");
    scanf("%d",&no);
    for(int i=1;i<=no;i++){
        fact=fact*i;
    }
    printf("Factorial is :%d",fact);
}