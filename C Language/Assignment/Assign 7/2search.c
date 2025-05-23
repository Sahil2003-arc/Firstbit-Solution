//search the given number in array 
#include<stdio.h>
int main()
{
    int arr[]={1,2,3,4,5};
    int n=sizeof(arr)/sizeof(arr[0]);
    int x=4;
    int flag=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]==x)
        {
            flag=1;
            break;
        }
    }
    if(flag==1)
    {
        printf("Element found\n");
    }
    else
    {
        printf("Element not found\n");
    }
    return 0;
}
