#include<stdio.h>
#include<string.h>

int main(){
    char str1[20]="Hello world";
    char str2[20]="Hello";

    int res=strcmp(str1,str2);
    printf("%d",res);
   return 0; 
}