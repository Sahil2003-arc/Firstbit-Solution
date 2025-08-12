//write a code to print string only if it has more than 3 vowels
#include<stdio.h>
#include<string.h>

int main(){
    char str[10];
    printf("Enter a string: ");
    scanf("%s",str);

int count=0;
    for(int i=0;str[i]!='\0';i++)
    {
        char c=str[i];    
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        {
            count++;
        }
    }
    if(count>3)
        printf("%s",str);
    else
        printf("string not found");
    
    return 0;
}