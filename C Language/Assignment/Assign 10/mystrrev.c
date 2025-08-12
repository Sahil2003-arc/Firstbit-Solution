#include<stdio.h>
#include<string.h>

char* mystrrev(char*);
void main()
{
    char str[20]="arti";

    char* x=mystrrev(str);
    printf("%s",x);
}
char* mystrrev(char* str)
{
  int len=strlen(str);
  printf("%d",len);
  char temp;
  int i=0;
   while(i<len/2)
   {
    	temp=str[len-1-i];
//    	printf("%c-",temp);
   		str[len-1-i]=str[i];
    	str[i]=temp;
    	i++;
   }
//   printf("%s",str);
   return str;
}