#include <stdio.h>
void main() {
    int no,sum=0;
    printf("Enter a number:");
    scanf("%d",&no);

    for(int i=1;i<no;i++) 
    {
        if(no%i==0) 
        {
            sum==i;
        }
    }

    if(sum==no) 
    {
        printf("%d is a perfect number.",no);
    } 
    else 
    {
        printf("%d is not a perfect number.",no);
    }
}
