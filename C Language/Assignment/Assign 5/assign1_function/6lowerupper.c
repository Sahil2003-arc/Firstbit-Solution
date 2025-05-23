#include <stdio.h>
void checkCharacter(); 
void main(){
    checkCharacter();
}
void checkCharacter(){
    char ch;
    printf("Enter a character:");
    scanf("%c", &ch);
    if(ch>='A' && ch<='Z'){
        printf("The character '%c' is uppercase.\n",ch);
    }else if(ch>='a' && ch<='z'){
        printf("The character '%c' is lowercase.\n",ch);
    } else{
        printf("The character '%c' is not an alphabet letter.\n",ch);
    }
}
