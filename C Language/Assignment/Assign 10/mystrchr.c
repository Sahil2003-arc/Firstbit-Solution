#include<stdio.h>
#include<string.h>

char* mystrchr(char*,char);
void main()
{
    char str[10]="Sahil";
     char ch='v';
    char* x=mystrchr(str,ch);
    printf("%u",x);
}
char* mystrchr(char*str,char v)
{
    int i=0;
    while(str[i]!='\0')
    {
      if(str[i]==v)
      {
        return &str[i];
      }
     i++;
    }
   return NULL;
}