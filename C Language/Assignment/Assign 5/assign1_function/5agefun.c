#include <stdio.h>

void age();
void main(){
    age();
}
void age(){
    int age;
    printf("enter the age:");
    scanf("%d",&age);

    if(age>=18)
        printf("Your are eligible for voting");
    else
        printf("Your are not eligible for voting"); 
}