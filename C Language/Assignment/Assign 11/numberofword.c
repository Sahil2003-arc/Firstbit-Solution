#include<stdio.h>
#include<string.h>
void main()
{
 char str[30];
 printf("enter a string:");

 fgets(str,sizeof(str),stdin);   //only use fgets 

 
 int i=0,count=0;
 int word=0;
 while(str[i]!='\0')
 {
    if(str[i]!=' '&& str[i]!='\n')  //space and newline
    {
        if(word==0){
        count++;
        word=1;
    }
    }
    else{
        word=0;
    }
    i++;
 }
printf("%d",count);
}