#include<stdio.h>
#include<string.h>
char* mystrcat(char*,char*);
void main()
{
    char  str1[10]="Abc";
     char str2[]="xyz";

    mystrcat(str1,str2);
    printf("%s",str1);

}
char* mystrcat(char* str1,char* str2)
{
    int i=0,j=0;
    while(str1[i]!='\0')
    {
        i++;
    }
    while(str2[j]!='\0')
    {
        str1[i]=str2[j];
        i++;
        j++;
    }

    // str1[i]='\0';

    return str1;
   
}