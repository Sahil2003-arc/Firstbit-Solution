#include<stdio.h>
#include<string.h>
#include<stdlib.h>
char* mystrdup(char*);
void main(){
     char str[]="hello";
     printf("%u\n",str);

     char* x=mystrdup(str);
     printf("%s\n",x);
}

char* mystrdup(char* ptr)
{
    int len=strlen(ptr)+1;
    // char dup[len]; ---->stack
    char*  dup=(char*)malloc(sizeof (char) * len); //---->heap
    for(int i=0;i<len;i++)
    {
      dup[i]=ptr[i];
    }
      return dup;
}


