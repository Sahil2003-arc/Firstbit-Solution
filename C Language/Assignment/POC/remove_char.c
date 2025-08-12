#include <stdio.h>
int main(){
    char str[100];
    int i;
    printf("Enter a string: ");
    scanf("%s",str);

    int index;
    printf("Enter the index of the character to be removed: ");
    scanf("%d",&index);

    for(i=index;str[i]!='\0';i++){
        str[i]=str[i+1];
    }
    str[i]='\0';
    printf("%s",str);
    return 0;
}