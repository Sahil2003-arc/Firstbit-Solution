#include<stdio.h>
 struct Date
{
     int date;
     int month;
     int year;
};
struct  Date storeDate();
void displayDate(struct Date);
void main()
{
   struct  Date d1;
   d1 = storeDate();
   displayDate(d1);
}
struct  Date storeDate()
 {
   struct  Date d1;
   printf(" Date is:");
   scanf("%d",&d1.date);
    printf("Date month is:");
   scanf("%d",&d1.month);
      printf(" Date year is:");
   scanf("%d",&d1.year);
   
   return d1;
}
void displayDate(struct Date d1)
{
   printf("%d/%d/%d",d1.date,d1.month,d1.year);
}

   