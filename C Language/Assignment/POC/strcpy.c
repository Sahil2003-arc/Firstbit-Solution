#include<stdio.h>
#include<string.h>
int main(){
    char str1[20]="Hello";
    char str2[20];
    strcpy(str2,str1);
    printf("String 1: %s\n",str1);
    printf("String 2: %s\n",str2);
    return 0;
}