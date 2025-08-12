#include<stdio.h>
#include<string.h>
void main()
{
    char str[10]="hello";
    char str1[]={};

    strcpy(str,str1);
    
    printf("%s\n",str);
    printf("%s\n",str1);

    
}