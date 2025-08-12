#include<stdio.h>
 struct sales
{
     int id;
     char name[20];
     double salary;
     int incentive;
     int target;
};
struct  sales storesales();
void displaysales(struct sales);
void main()
{
   struct sales s1;
   s1 = storesales();
   displaysales(s1);
}
struct sales storesales()
 {
   struct  sales s1;
   printf("sales id is:");
   scanf("%d",&s1.id);
    printf("sales name is:");
   scanf("%s",&s1.name);
      printf("sales salary is:");
   scanf("%lf",&s1.salary);
    printf(" incentive is:");
   scanf("%d",&s1.incentive);
   printf(" target is:");
   scanf("%d",&s1.target);
   
   return s1;
}
void displaysales(struct sales s1)
{
   printf("id=%d\n",s1.id);
   printf("name=%s\n",s1.name);
   printf("salary=%lf\n",s1.salary);
    printf("incentive=%d\n",s1.incentive);
    printf(" target=%d\n",s1.target);
}

   