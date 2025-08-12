#include<stdio.h>
#include<string.h>
void main()
{
     int size;
    char str[]="sahil";
    char str1[]="sss";

     size=strcspn(str,str1);   //match the charcter
    
    printf("%d",size);
    

}
