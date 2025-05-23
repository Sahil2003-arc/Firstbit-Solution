#include<stdio.h>
void main(){
    int marks;

    printf("Enter the marks:");
    scanf("%d",&marks);

    if(marks>75){
        printf("Distinction\n");
    }else if(marks>65){
        printf("First class\n");
    }else if(marks>55){
        printf("Second class\n");
    }else if(marks>40){
        printf("Pass\n");
    }else{
        printf("Fail\n");
    }
     
}