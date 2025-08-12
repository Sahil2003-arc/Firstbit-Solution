#include<stdio.h>
#include<string.h>
int mystrncmp(char*,char*,int);
void main(){
   char str[]="sahil";
   char str1[]="ppk";
   int num=2;

    int res=mystrncmp(str,str1,num);
    printf("%d",res);
}

int mystrncmp(char* str,char*str1,int num)
{
    int flag;
for(int i=0;i<num;i++)
    {
       if(str[i]==str1[i])
       {
         flag=0;
       }
       else
       return 1;
    }
    return flag;
}