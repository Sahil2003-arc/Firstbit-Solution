#include<stdio.h>
int main(){
    int arr[10]={1,2,3,4,5,6,7,8,9,10};
   
    int flag=0;
    printf("Prime numbers: ");
    for(int i=0;i<arr[i];i++){
        flag=0;
        for(int j=2;j<arr[i];j++){
            if(arr[i]%j==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            printf("%d ",arr[i]);
        }
    }    
    return 0;

}