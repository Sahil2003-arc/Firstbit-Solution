#include<stdio.h>
#include<string.h>
void main()
{
    char str[100];
    printf("enter the string:");
    scanf("%s",&str);
    int i=0,j=0;
    while(str[i]!='\0')
    {
       
        if(i%2!=0){
          str[j++]=str[i];   //j starts form 1
            
        }
         i++;   
    }
    str[j]='\0';
        printf("modified string %s",str);
}