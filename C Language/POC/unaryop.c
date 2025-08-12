#include<stdio.h>
void main(){
    int a=1,b=0;
    int c= a-- && ++b || a++ && --b ; 
    printf("%d%d%d",c,b,a);
}