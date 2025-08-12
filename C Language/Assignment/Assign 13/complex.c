#include<stdio.h>
 struct Complex
{
     int real;
     int imaginary;
     
};
struct Complex storeComplex();
void displayComplex(struct Complex);
void main()
{
   struct  Complex c1;
   c1 = storeComplex();
   displayComplex(c1);
}
struct  Complex storeComplex()
 {
   struct   Complex c1;
   printf("Complex real is:");
   scanf("%d",&c1.real);
    printf(" Complex inch is:");
   scanf("%d",&c1.imaginary);
    
   
   return c1;
}
void displayComplex(struct  Complex c1)
{

   printf("%d + %di",c1.real,c1.imaginary);
   
}

   