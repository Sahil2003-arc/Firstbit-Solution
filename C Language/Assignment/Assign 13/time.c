#include<stdio.h>
 struct time
{
     int hour;
     int min;
     int sec;
};
struct  time storetime();
void displaytime(struct time);
void main()
{
   struct time t1;
   t1 = storetime();
   displaytime(t1);
}
struct  time storetime()
 {
   struct time t1;
   printf(" hour is:");
   scanf("%d",&t1.hour);
    printf(" minute is:");
   scanf("%d",&t1.min);
      printf(" second is:");
   scanf("%d",&t1.sec);
   
   return t1;
}
void displaytime(struct time t1)
{
   printf("%d:%d:%d:",t1.hour,t1.min,t1.sec);

}

   