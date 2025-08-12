#include<stdio.h>
#include<stdlib.h>
void StoreArray(int,int*);
void display(int,int*);
int even(int,int*);
int odd(int,int*);
void main()
{
  int size;
  printf("enter the size of an array:");
  scanf("%d",&size);
   int* arr=(int*)malloc(sizeof(int)*size);
//  int arr[size];
   StoreArray(size,arr);
   display(size,arr);
   even(size,arr);
   odd(size,arr);
}
void StoreArray(int size,int* arr)
{
  printf("enter the numbers");
   for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
}
void display(int size,int* arr)
{
  printf("enter the numbers");
   for(int i=0;i<size;i++)
    {
        printf("%d",arr[i]);
    }
}
int even(int size,int*arr){
   printf("even number are");
    for(int i=0;i<size;i++){
        if(arr[i]%2==0){
            printf("%d\n",arr[i]);   //array intialize 
        }
    }
}
int odd(int size,int*arr){
    printf("odd number are");
     for(int i=0;i<size;i++){
        if(arr[i]%2!=0){
            printf("%d\n",arr[i]);
        }
    }

}