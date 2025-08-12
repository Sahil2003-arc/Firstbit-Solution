#include <stdio.h>
int main() {
    int a[10],i,sum=0;

    for(i=0;i<5;i++){
        printf("Enter %d element: ",i+1);
        scanf("%d",&a[i]);
        sum=sum+a[i];
    } 
    printf("Sum of entered numbers:%d\n",sum);
    return 0;
}
