#include<stdio.h>
void main(){
    int no,i,flag;
    printf("Enter the number:");
    scanf("%d",&no);
    
    i=2;
    flag=0;
    while (i<no)
    {
        if(no%i==0){
            flag=1;
            break;
        }
        i++;
    }
    if(flag==0){
        printf("Prime");
    }else{
        printf("Not prime");
    }

}