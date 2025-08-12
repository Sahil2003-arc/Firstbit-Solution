#include<stdio.h>
#include<string.h>
char* mystrcat(char*,char*,int);
void main()
{
    char  str1[10]="Abc";
     char str2[]="xyz";
     int num=2;

    mystrcat(str1,str2,num);
    printf("%s",str1);

}
char* mystrcat(char* str1,char* str2,int num)
{
    int i=0,j=0;
    while(i<num)
    {
        i++;
    }
    while(j<num)
    {
        str1[i]=str2[j];
        i++;
        j++;
    }

    // str1[i]='\0';

    return str1;
   
}