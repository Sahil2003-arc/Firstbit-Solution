#include<stdio.h>
#include<string.h>
void main()
{
    char str[100];
    
    printf("enter a string:");
    scanf("%s",&str);
    int i=0;
    
    while(str[i]!='\0')
    {
    
      if(str[i]=='a')
      str[i]='$';
      i++;
    }

    printf("%s",str);
}