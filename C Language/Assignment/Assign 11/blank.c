#include<stdio.h>
#include<string.h>
void main()
{
    char str[100];
    printf("enter the string:");

     fgets(str, sizeof(str), stdin);   //space also read the fgets
    int i=0;
    while(str[i]!='\0')
    {
     if(str[i]==' ') 
     {
         str[i]='$';
        
     }
      i++;
    }
    printf("modified string %s",str);
}