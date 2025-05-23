#include <stdio.h>
 
void main()
{
    int eng=45,phy=60,chem=74,math=57,comp=88; 
    float total,avg,percentage; 
    total=eng+phy+chem+math+comp;
    avg=total/5;
    percentage=(total/500) * 100; 
    printf("Total marks = %.f\n",total);
    printf("Average marks = %.2f\n",avg);
    printf("Percentage = %.2f",percentage);

}