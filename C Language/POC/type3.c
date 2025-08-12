#include<stdio.h>
void areaofrect(float,float);
void periofrect(float,float);
void main(){
    float l,b;
    printf("Enter the length and bredth: ");
    scanf("%f%f",&l,&b);
    areaofrect(l,b);
    periofrect(l,b);
}
void areaofrect(float l,float b){
    
   
    float area=l*b;
    printf("Area of rectangle is %f\n",area);
}
void periofrect(float l,float b){
    float peri=2*(l+b);
    printf("Perimeter of rectangle is %f\n",peri);
}
