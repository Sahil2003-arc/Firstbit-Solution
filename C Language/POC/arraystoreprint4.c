#include<stdio.h>
void storeArray(int*, int);
void printArray(int*, int);
int main(){
    int arr[10],brr[5];
    storeArray(arr,10);
    storeArray(brr,5);
    printArray(arr,10);
    printArray(brr,5);
    printf("\n");
    return 0;
}

void storeArray(int* ptr,int n){
    for(int i=0;i<n;i++)
    {
        scanf("%d",&ptr[i]);
    }    
}

void printArray(int* ptr,int n){
    for(int i=0;i<n;i++)
    {
        printf("%d ",ptr[i]);
    }
} 

