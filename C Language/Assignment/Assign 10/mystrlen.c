#include<stdio.h>
#include<string.h>
int mystrlen(char*);
void main()
{
    char str[]="sahil";

    int x=mystrlen(str);
    printf("%d",x);
}
int mystrlen(char*str)
{
    int i=0,count=0;
   while(str[i]!='\0')
   {
      
      count++;
      i++;
   }
   return count;
}