#include<stdio.h>
void main(){
    int age;
    
    printf("Enter the number:");
    scanf("%d",&age);

    if(age<12){
        printf("It is a child");
    }
    else if(age>=12 && age<=19){
        printf("It is a teenager");
    }
    else if(age>=20 && age<=59){
        printf("It is Adult");
    }
    else if(age>60){
        printf("senior");
    }

}