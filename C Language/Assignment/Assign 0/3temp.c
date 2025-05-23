#include<stdio.h>
void main(){
    float f,c;
    printf("Enter the celsius:");
    scanf("%f",&c);
    f=(9/5 * c) + 32;
    printf("Celsius to Fahrenheit is %.2f",f);
}