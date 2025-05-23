#include<stdio.h>
int main()
{
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    for(int i=0;i<10;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<10;i=i+2)
    {
        printf("%d\n",arr[i]);
    }
    return 0;
}