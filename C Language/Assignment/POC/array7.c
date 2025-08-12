#include<stdio.h>
void main(){
    int arr[]={1,2,3,2,4,3,4,5,5,4,3,5,6};
    int size=sizeof(arr)/4;
    int vis[10]={};

    for(int i=0;i<size;i++)
    {
        if(vis[i]==1)
        {
          printf("skip ");
          continue;
        }
        int count=1;
        for(int j=i+1;j<size;j++)
        {
            if(arr[i]==arr[j])
            {
              count++;
              vis[j]=1;
            }
        }
         printf("%d ",arr[i]);
    }
    
}