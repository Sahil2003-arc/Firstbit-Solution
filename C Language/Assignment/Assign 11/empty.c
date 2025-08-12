#include<stdio.h>
#include<string.h>
void main()
{
    char str[10];
     int index;
    printf("enter a string:");
    scanf("%s",&str);
    printf("enter a index:");
    scanf("%d",&index);

    int i=0;
    // int len=strlen(str);
   
    while(str[i]!='\0')
    {
        if(i==index)
        str[i]=str[i+1];
         i++;
        // str[len-1];
    }
      str[i-1]='\0';
   
    printf("%s",str);

}   
// op:
// enter a string:payal
// enter a index:3
// payl