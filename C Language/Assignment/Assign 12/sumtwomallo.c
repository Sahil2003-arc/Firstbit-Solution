#include<stdio.h>
#include<stdlib.h>
void StoreArray(int,int*);
void display(int,int*);
int sum(int,int*);

void main(){
    int size,num;
    printf("enter the size of an array:");
    scanf("%d",&size);
    int* arr=(int*)malloc(sizeof(int)*size);
//    int arr[size];
    StoreArray(size,arr);
    display(size,arr);
    sum(size,arr);

}
void StoreArray(int size,int* arr){
    printf("enter the number:");
    for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
}
void display(int size,int* arr){
    // printf("enter the number:");
    for(int i=0;i<size;i++)
    {
        printf("%d\n",arr[i]);
    }
}
int sum(int size,int*arr){
    int sum=0;
    for(int i=0;i<size;i++)
    {
        sum=sum+arr[i];
    }
   printf("%d",sum);
}