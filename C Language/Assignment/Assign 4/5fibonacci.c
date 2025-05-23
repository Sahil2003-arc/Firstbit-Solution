#include <stdio.h>
int main(){
    int n,a=0,b=1,sum,i;

    printf("Enter the number of terms: ");
    scanf("%d",&n);

    if(n<=0){
        printf("Invalid input. Please enter a positive integer.\n");
        return 1;
    }
    printf("Fibonacci series up to %d terms:\n",n);
    for(i=1;i<=n;i++){
        printf("%d ",a);
        sum=a+b;
        a=b;
        b=sum;
    }
    return 0;
}