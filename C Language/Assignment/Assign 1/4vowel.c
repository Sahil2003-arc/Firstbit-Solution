#include<stdio.h>
void main(){

    char ch;
    printf("Enter the char: ");
    scanf("%c",&ch);

     if(ch >= 'a' && ch <= 'z')
     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
     {
       printf("Is it vowel",ch);
    }
    else
    {
        printf("is it consonant",ch);
    }
    else{
        printf("it is not charater");
    }
     }
