#include<stdio.h>
struct mobile{
    int id;
    char brandname[10];
    double price;
    char color[20];
};
void main()
{
    struct mobile m1,m2;

    printf("enter the mobile details:");
    scanf("%d",&m1.id);
    fflush(stdin);
    scanf("%s",&m1.brandname);
      fflush(stdin);
    scanf("%ld",&m1.price);
    fflush(stdin);
     scanf("%s",&m1.color);
     
  


    printf("enter the mobile details:");
    scanf("%d",&m2.id);
    fflush(stdin);
    scanf("%s",&m2.brandname);
      fflush(stdin);
    scanf("%ld",&m2.price);
    fflush(stdin);
    scanf("%s",&m2.color);
    // scanf("%s",&m2.color);

    printf("all the details are follows:fdsgdfg");
  printf("id=%d brandname=%s price=%ld color=%s\n",m1.id,m1.brandname,m1.price,m1.color);
  printf("id=%d brand=%s price=%ld color=%s\n",m2.id,m2.brandname,m2.price,m2.color);
}