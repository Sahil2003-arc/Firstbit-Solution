#include <stdio.h>
int main(){
    int arr1[5],arr2[5],merged[10];

    printf("Enter 5 elements for array 1:\n");
    for (int i=0;i<5;i++){
        scanf("%d", &arr1[i]);
    }

    printf("Enter 5 elements for array 2:\n");
    for(int i=0;i<5;i++){
        scanf("%d",&arr2[i]);
    }

    for(int i=0;i<5;i++){
        merged[i] = arr1[i];
    }

    for(int i=0;i<5;i++){
        merged[5+i]=arr2[i];
    }

    printf("Merged array: ");
    for (int i=0;i<10;i++){
        printf("%d ",merged[i]);
    }
    return 0;
}
