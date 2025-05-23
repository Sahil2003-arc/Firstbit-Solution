#include<stdio.h>
void price();
void main(){
    price();
    
}
void price(){
    int price;
    char student;
    printf("Are you a student: ");
    scanf(" %c",&student);
    printf("Enter the price");
    scanf("%d",&price);
    if(student=='Y' || student=='y'){
        if(price>=500)
        {
            printf("you got 20 discount");
        }
        else
        {
            printf("you got 10 discount");
        }
    }
    else
    {
        if(price>=600)
        {
            printf("You got 15 discount");
        }
        else
        {
            printf("No discount");
        }
    }
}