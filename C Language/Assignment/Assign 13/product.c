#include<stdio.h>
 struct Product
{
     int id;
     char name[20];
     int quantity;
     int price;  
};
struct Product storeProduct();
void displayProduct(struct Product);
void main()
{
   struct Product P1;
   P1 = storeProduct();
   displayProduct(P1);
}
struct Product storeProduct()
 {
   struct  Product P1;
   printf("Product id is:");
   scanf("%d",&P1.id);
    printf("Product name is:");
   scanf("%s",&P1.name);
      printf("Product quantity is:");
   scanf("%d",&P1.quantity);
    printf("Product price is:");
   scanf("%d",&P1.price);
  
   
   return P1;
}
void displayProduct(struct Product P1)
{
   printf("id=%d\n",P1.id);
   printf("name=%s\n",P1.name);
   printf("quantity=%d\n",P1.quantity);
    printf("Price=%d\n",P1.price);
    
}

   