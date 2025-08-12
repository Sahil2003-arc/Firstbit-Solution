#include<stdio.h>
#include<stdlib.h>
void storeArray(int,int*);
void display(int,int*);
void prime(int*,int);
void main()
{
  int num,size;
  printf("enter the size of an array:");
  scanf("%d",&size);
   int* arr=(int*)malloc(sizeof(int)*size);
//  int arr[size];
  storeArray(size,arr);
  display(size,arr);
  prime(arr,size);
}
void storeArray(int size,int*arr){
  printf("enter the numbers");
   for(int i=0;i<size;i++)
    {
         scanf("%d",&arr[i]);
    }
}
void display(int size,int*arr){

  printf("array is:");
    for(int i=0;i<size;i++)
    {
         printf("%d",arr[i]);
    }
}
void prime(int*arr,int size){
   printf("print prime number is:");
   for(int i=0;i<size;i++)
   {
      int flag=0;
      for(int j=2;j<=arr[i]/2;j++)
      {
        if(arr[i]%j==0){
            flag=1;
            break;
        }
      }
      if(flag==0)
        printf("%d",arr[i]);
   }
}   