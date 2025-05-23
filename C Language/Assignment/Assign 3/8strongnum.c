#include<stdio.h>
void main() {
    int no;
    int temp;
    printf("Enter number:");
    scanf("%d",&no);
    int sum=0;
    temp=no;
    int rem;
    while(no>0){
        rem=no%10;
        int fact=1;
        for (int i=1;i<=rem;i++){
            fact=fact*i;
        }
        sum=sum+fact;
        no=no/10;
    }
    if(sum==temp) 
    {
        printf("strong number\n");
    } 
    else 
    {
        printf("not strong number\n");
    }
}
