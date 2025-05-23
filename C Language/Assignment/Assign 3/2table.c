#include<stdio.h>
void main(){
    int no,i;
    printf("Enter the number:");
    scanf("%d",&no);
    for(i=1;i<=10;i++){
        printf("%d\n",no*i);
    }
}