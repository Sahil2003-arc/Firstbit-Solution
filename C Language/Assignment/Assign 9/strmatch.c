#include<stdio.h>
#include<string.h>
void main()
{
     int size;
    char str[]="akanksha";
    char str1[]="fff";

     size=strcspn(str,str1);   //match the charcter
    
    printf("%d",size);
    
}