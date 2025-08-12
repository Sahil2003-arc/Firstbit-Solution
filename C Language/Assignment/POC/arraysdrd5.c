#include<stdio.h>
void storearray(int*,int);
void displayarray(int*,int);
void replace(int*,int,int,int);
void displayarray(int*,int);

 void main(){
    int arr[10];
    storearray(arr,10);
    displayarray(arr,10);
    replace(arr,10,5,7);
    displayarray(arr,10);
}

void storearray(int* arr,int n){
    printf("Enter the value of arr[%d]: ",n);
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
}
// void displayarray(int* arr,int n){
//     printf("The values of arr are: ");
//     for(int i=0;i<n;i++){
//         printf("%d ",arr[i]);
//     }
// }
void replace(int* arr,int n,int x,int y){
    for(int i=0;i<n;i++){
        if(arr[i]==x){
            arr[i]=y;
        }
    }
}
void displayarray(int* arr,int n){
    printf("\nThe values of arr are: ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
}