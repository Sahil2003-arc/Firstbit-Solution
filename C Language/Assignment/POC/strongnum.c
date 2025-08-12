#include<stdio.h>
void main(){
    int num,rem,sum=0;
    printf("Enter the number:");
    scanf("%d",&num);

    int temp=num;
    while(num>0){
        rem=num%10;
        int fact=1;
       for(int i=rem;i>=1;i--){
        fact=fact*i;
       }
       sum=sum+fact;
       num=num/10;
    }
    if(temp==sum){
        printf("strong");
    }else{
        printf("not strong");
    }
}