#include<stdio.h>
void main(){
    int arr[5]={1,2,3,4,5};
    int brr[5]={6,7,8};
    int crr[5]={11,12,13,14,18,19};
    int drr[]={21,22,23,24,25};
    
    for(int i=0;i<5;i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
    for(int i=0;i<5;i++){
        printf("%d ",brr[i]);
    }
    printf("\n");
    for(int i=0;i<5;i++){
        printf("%d ", crr[i]);
    }
    printf("\n");
    for(int i=0;i<5;i++){
        printf("%d ",drr[i]);
    }
    printf("\n");
}
