#include<stdio.h>
#include<stdlib.h>
int* reverseArr(int*,int);  
void main(){
    int arr[]={1,2,3,4,5};
    int* reversedArr=reverseArr(arr,5);

    for(int i=0;i<5;i++){
        printf("%d ",reversedArr[i]);
    }
}

int* reverseArr(int* ptr,int size){
    int j;
    int* newarr=(int*)malloc(sizeof(int)*size);
    for(int i=0,j=size-1;i<size;i++,j--){
        newarr[j]=ptr[i];
    }
    return newarr;
}