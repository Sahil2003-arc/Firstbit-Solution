#include<stdio.h>
#include<string.h>
char* mystrlower(char*);
void main()
{
  char str[20]="VIRAT";

  char* x=mystrlower(str);
   printf("%s",x);
}

char* mystrlower(char*str)
{   
    int i=0;
     while(str[i]!='\0')
     {
      str[i]=str[i]+32;
      i++;
     }
     return str;
}