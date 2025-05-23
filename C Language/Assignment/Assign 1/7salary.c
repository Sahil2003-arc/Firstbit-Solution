#include<stdio.h>
void main(){
   
    float da,ta,hr,basic,totalsalary;

    printf("Enter the basic:");
    scanf("%f",&basic);

    if (basic<=5000)
    {
        da=0.10*basic;
        ta=0.20*basic;
        hr=0.25*basic;
    }
    else
    {
        da=0.15*basic;
        ta=0.25*basic;
        hr=0.30*basic;
    }
    totalsalary=da+ta+hr+basic;
    printf("Total salary=%.2f\n",totalsalary);
    
}