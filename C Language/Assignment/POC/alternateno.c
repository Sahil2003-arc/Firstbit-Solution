#include<stdio.h>
void main(){
    int start,end,sum=0;
    int i;
    printf("Enter the value of start and end:\n");
    scanf("%d%d", &start, &end);
    
    for (i=start ; i<=end ; i=i+2)
    {
         sum=sum+i;
    }
    
    printf("The sum of Alternate number:%d",sum);
}