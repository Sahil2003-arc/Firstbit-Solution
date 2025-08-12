#include<stdio.h>
#include<stdlib.h>
void storeArray(int,int*);
void display(int,int*);
void Alternate(int,int*);
void main(){
    int size;
    printf("enter the size of an array: ");
    scanf("%d",&size);
    int* arr=(int*)malloc(sizeof(int)*size);
//     int arr[size];
    storeArray(size,arr);
    display(size,arr);
     Alternate(size,arr);
}   
void storeArray(int size,int*arr)
{
    printf("enter the number:");
    for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
}
void display(int size,int*arr)
{
    // printf("enter the number:");
    for(int i=0;i<size;i++)
    {
        printf("%d",arr[i]);
    }
}
void Alternate(int size,int*arr)
{
    int sum=0;
    
    for(int i=0;i<size;i=i+2)
    {
      sum=sum+arr[i];
    }
    printf("alternate number of addition is %d",sum);
}