#include<stdio.h>
#include<string.h>
void main()
{
    char str[30];
    int i,len=0,flag=1;
    printf("enter a string:");
    scanf("%s",str);


   for(i=0;str[i]!='\0';i++)
   {
    if(str[i]=='\n')break;
    len++;
   }

   for(i=0;i<len/2;i++)
   {
    if(str[i]!=str[len-1-i])
    flag=0;
    break;
   }

   if(flag==1)
   printf("palindrome");
   else
   printf("not palindrome");
}


