#include<stdio.h>
#include<string.h>
void main(){
     char str[]="this is  some random string";
    char str2[100];
    //  char* x=strtok(str," ");
    
    int j=0;
    int flag=1;
    for(int i=0;str[i]!='\0';i++)
    {
        if(str[i])
        {
            flag=1;
        }
        else if(flag)
        {
            str2[j++]=str[i];
            flag=0;
        }
    }
    
}