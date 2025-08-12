#include<stdio.h>
 struct HR
{
     int id;
     char name[20];
     double salary;
     int commision;
};
struct HR storeHR();
void displayHR(struct HR);
void main()
{
   struct  HR h1;
   h1 = storeHR();
   displayHR(h1);
}
struct HR storeHR()
 {
   struct HR h1;
   printf(" HR id is:");
   scanf("%d",&h1.id);
    printf("HR name is:");
   scanf("%s",&h1.name);
      printf(" HR salary is:");
   scanf("%lf",&h1.salary);
    printf(" comminsion is:");
   scanf("%d",&h1.commision);
   
   return h1;
}
void displayHR(struct HR h1)
{
   printf("id=%d\n",h1.id);
   printf("name=%s\n",h1.name);
   printf("salary=%lf\n",h1.salary);
    printf("commision=%d\n",h1.commision);
}

   