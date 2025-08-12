#include<stdio.h>
void mystrrev(char[]);
void main(){
    char str[]="Pooja";
    mystrrev(str);

}
void mystrrev(char str[]){
    int count=0;
    while(str[count]!='\0') {
        count++;
    }
      
    for(int i=count;i>=0;i--){
        printf("%c",str[i]);       
    }
}
