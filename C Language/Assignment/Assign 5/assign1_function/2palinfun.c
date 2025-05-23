#include <stdio.h>

void pallindrome();
void main(){
    pallindrome();
}
void pallindrome(){
    int num,r1,r2,r3,q1,q2,sum;
    printf("Enter the number:");
    scanf("%d",&num); //121
    r1 = num % 10; //1
    r1 = r1 *100; //100
    q1 = num/10; //12
    r2 = q1 %10; //2
    r2 = r2 *10;  //20
    r3 = q1 / 10;
    sum = r1+r2+r3; 
    printf("%d\n",sum);
    if(num==sum){
        printf("The given number in palindrome.");
    }
    else{
        printf("The given number is not palindrome.");
    }
}