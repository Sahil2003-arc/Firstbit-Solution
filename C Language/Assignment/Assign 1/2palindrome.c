#include<stdio.h>
void main(){
    int a,no,rem,rev=0;
    printf("Enter the number:");
    scanf("%d",&a);
    int temp=a;
    no=a;

    while (temp!=0)
    {
        rem=temp%10;
        rev=rev*10+rem;
        temp=temp/10;
    }
    if(no==rev){
        printf("number is palindrome");
    }else{
        printf("number is not palindrome");
    }

}