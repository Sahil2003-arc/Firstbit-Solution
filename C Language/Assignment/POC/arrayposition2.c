#include<stdio.h>
void main(){
    int a[5];
    int no,index,flag=0;

    for(int i=0;i<5;i++){
        printf("Enter %d the number:",i);
        scanf("%d",&a[i]);
    }

    printf("Enter the number:");
    scanf("%d",&no);

    for(int i=0;i<5;i++){     
        if(no==a[i]){
            index=i;
            printf("%d is found at position at %d:",no,index);
            flag=1;
            break;
        }
    }

    if(flag==0){
        printf("not found");
    }
}