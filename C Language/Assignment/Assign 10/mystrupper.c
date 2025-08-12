#include<stdio.h>
#include<string.h>
char* mystrupper(char*);
void main()
{
  char str[20]="sahil";

  char* x=mystrupper(str);
   printf("%s",x);
}

char* mystrupper(char*str)
{   
    int i=0;
     while(str[i]!='\0')
     {
      str[i]=str[i]-32;
      i++;
     }
     return str;
}