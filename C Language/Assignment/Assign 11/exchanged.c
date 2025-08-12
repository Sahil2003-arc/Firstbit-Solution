#include<stdio.h>
#include<strings.h>
void main()
{
    char str[20];
    printf("enter the string:");
    scanf("%s",&str);
    // int i=0;
    int len=strlen(str);
       

    // while(str[i]!=len)
  if (len>1)        //len atleast having two charachter in string
   
    {
       
     char temp;
    temp=str[0];
    str[0]=str[len-1];
    str[len-1]=temp; 
    }
    printf("%s",&str);
}