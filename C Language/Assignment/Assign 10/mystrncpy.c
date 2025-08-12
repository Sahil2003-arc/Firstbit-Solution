#include<stdio.h>
#include<string.h>
char* mystrncpy(char*,char*,int);
void main(){
     char str1[]="siddhi";
     char str2[10];
     int num=3;

     char* x=mystrncpy(str2,str1,num);
     printf("%s",x);
}

char* mystrncpy(char*str2,char*str1,int num)
{
    int i=0;
  while (i<num)
  {
    str2[i]=str1[i];
    i++;
  }
  return str2;
  
}