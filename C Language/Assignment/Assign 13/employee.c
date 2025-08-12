#include<stdio.h>
 struct employee
{
     int id;
     char name[20];
     double salary;
};
struct employee storeemployee();
void displayemployee(struct employee);
void main()
{
   struct employee e1;
   e1 = storeemployee();
   displayemployee(e1);
}
struct employee storeemployee()
 {
   struct employee e1;
   printf("employee id is:");
   scanf("%d",&e1.id);
    printf("employee name is:");
   scanf("%s",&e1.name);
      printf("employee salary is:");
   scanf("%lf",&e1.salary);
   
   return e1;
}
void displayemployee(struct employee e1)
{
   printf("id=%d",e1.id);
   printf("name=%s",e1.name);
   printf("salary=%lf",e1.salary);
   
}

   