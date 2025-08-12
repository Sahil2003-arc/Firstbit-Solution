#include<stdio.h>
void main(){
    int base,exp;
    printf("Enter the base number:");
    scanf("%d",&base);
    printf("Enter the power:");
    scanf("%d",&exp); 
    
    int pow=1;
    for(int i=1;i<=exp;i++){
        pow=pow*base;        
    }
    printf("%d",pow);
}