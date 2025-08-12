#include<stdio.h>
#include<string.h>
void main()
{   
    char str[100],ch;
    printf("enter a  string:");
    scanf("%s",&str);

    printf("enter a charchter:");
    scanf(" %c",&ch);

    char* res=strchr(str,ch);

    if(res!=NULL)    //result are 1char 
    {
        printf("found charcter");
    }
    else{
        printf("not found");
    }
}