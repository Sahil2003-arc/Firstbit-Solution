#include<stdio.h>
 struct Distance
{
     int feet;
     int inch;
     
};
struct Distance storeDistance();
void displayDistance(struct Distance);
void main()
{
   struct   Distance d1;
   d1 = storeDistance();
   displayDistance(d1);
}
struct  Distance storeDistance()
 {
   struct   Distance d1;
   printf("Distance feet is:");
   scanf("%d",&d1.feet);
    printf(" Distance inch is:");
   scanf("%d",&d1.inch);
    
   
   return d1;
}
void displayDistance(struct  Distance d1)
{

   printf("%dfeet %dinches",d1.feet,d1.inch);
   
}

   