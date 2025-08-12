#include <stdio.h>
#include <string.h>
#include <ctype.h>  // for tolower()

int mycasestrcmp(char*, char*,int);

void main()
{
    char str1[20] = "Sahil";
    char str2[20] = "pawar";
    int num=2;

    int result = mycasestrcmp(str1, str2,num);
    printf("%d",result);

}

int mycasestrcmp(char* str1, char* str2,int num)
{
    int i = 0;
    while(i<num) 
        
    {
        if(tolower(str1[i]) != tolower(str2[i]))
            return tolower(str1[i]) - tolower(str2[i]);
        i++;
    }

  
    return tolower(str1[i]) - tolower(str2[i]);
}
