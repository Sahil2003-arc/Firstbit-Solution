#include<stdio.h>
void main(){
    int num=154,r;
    int temp=num;
    int sum=0;

    while(temp!=0)
    {
     r=temp%10;
     sum=sum+r*r*r;
     temp=temp/10;
    }
     
    if(sum==num){
        printf("it is armstrong");
    }else{
        printf("it is not armstrong");
    }


}