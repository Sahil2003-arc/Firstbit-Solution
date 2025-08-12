#include<stdio.h>
 void storeArray(int*);
 void display(int*);
void merge(int*,int*);
void main()
{
	 
    int arr[10];
   int brr[5];
    storeArray(arr);
     display(arr);
      storeArray(brr);
     display(brr);
     merge(arr,brr);


}
void storeArray(int* arr){
//   int arr[10];
  printf("enter the numbers:");
   for(int i=0;i<3;i++)
    {
        scanf("\n%d",&arr[i]);
    }
}
//   int brr[5];
  void display(int*brr)
  {
  printf("enter the numbers:");
   for(int i=0;i<3;i++)
    {
        printf("%d\n",brr[i]);
    }
}
void merge(int*arr,int*brr){
    for(int i=0;i<6;i++)
    {
        arr[3+i]=brr[i];
    }

    for(int i=0;i<6;i++){
    printf("%d",arr[i]);
    }
}