#include<stdio.h>
 struct Admin
{
     int id;
     char name[20];
     double salary;
     int allowance;
};
struct  Admin storeAdmin();
void displayAdmin(struct Admin);
void main()
{
   struct  Admin a1;
   a1 = storeAdmin();
   displayAdmin(a1);
}
struct  Admin storeAdmin()
 {
   struct Admin a1;
   printf(" Admin id is:");
   scanf("%d",&a1.id);
    printf(" Admin name is:");
   scanf("%s",&a1.name);
      printf(" Admin salary is:");
   scanf("%lf",&a1.salary);
    printf(" allowance is:");
   scanf("%d",&a1.salary);
   
   return a1;
}
void displayAdmin(struct Admin a1)
{
   printf("id=%d\n",a1.id);
   printf("name=%s\n",a1.name);
   printf("salary=%lf\n",a1.salary);
    printf("allowance=%d\n",a1.allowance);
}

   