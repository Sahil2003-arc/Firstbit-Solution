#include<stdio.h>
#include<string.h>
void main()
{
    char str[100];
   
    printf("enter the string:");
    scanf("%s",&str);
    int count=0,i=0;
    while(str[i]!='\0'){
    if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U'){
      count++;

    }
   i++;
}

printf("%d",count);
}