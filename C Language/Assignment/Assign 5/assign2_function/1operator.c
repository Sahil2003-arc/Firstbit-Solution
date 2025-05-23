#include<stdio.h>
void function1();
void main(){
     function1();
}
void function1(){
    int res,no1,no2;

    char op;
    printf("Enter the number:");
    scanf("%d%d",&no1,&no2);

    printf("Choose the operator(+,-,/,*):");
    fflush(stdin);
    scanf("%c",&op);
    
    if(op=='+'){
        res=no1+no2;
    }
    else if(op=='-'){
        res=no1-no2;
    }
    else if(op=='/'){
        res=no1/no2;
    }
    else if(op=='*'){
        res=no1*no2;
    }
    else{
        res=no1%no2;
    }
    printf("Result:%d",res);
}