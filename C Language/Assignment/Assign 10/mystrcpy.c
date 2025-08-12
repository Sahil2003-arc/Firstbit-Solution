#include<stdio.h>
#include<string.h>
char* mystrcpy(char*,char*);
void main(){
     char str1[]="pooja";
     char str2[10];

     char* x=mystrcpy(str1,str2);
     printf("%s",x);
}

char* mystrcpy(char*str1,char*str2)
{
    int i=0;
  while (str1[i]!='\0')
  {
    str2[i]=str1[i];
    i++;
  }
  return str2;
  
}