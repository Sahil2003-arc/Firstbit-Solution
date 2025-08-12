#include<stdio.h>
#include<stdlib.h>
void storeArray(int,int*);
void display(int,int*);
int maxArray(int*,int);
 int minArray(int*,int);
void main(){
    int size;
    printf("enter the size of an array: ");
    scanf("%d",&size);
    int* arr=(int*)malloc(sizeof(int)*size);
//    int arr[size];
   storeArray(size,arr);
   display(size,arr);
    maxArray(arr,size);
     minArray(arr,size);
}
    void storeArray(int size,int*arr)
    {
    printf("enter the number:");
      for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
     }
    }

    void display(int size,int*arr)
    {
      printf("enter the number:");
      for(int i=0;i<size;i++){
        printf("%d",arr[i]);
      }
    }
    int maxArray(int *arr,int size)
    {
    int max=arr[0];
    for(int i=1;i<size;i++)
    {
        if(arr[i]>max){
            max=arr[i];
        }
    }
    printf("the max number is %d",max);
 }
 int minArray(int* arr,int size){
    int min=arr[0];
    for(int i=1;i<size;i++)
    {
        if(arr[i]<min){
            min=arr[i];
        }
    }
    printf("the min number is %d",min);
}
