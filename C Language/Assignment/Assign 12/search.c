#include<stdio.h>
void searcharray(int*,int,int);
void main()
{
    int arr[20],n,num;

    printf("enter the elments in array:");
    scanf("%d",&n);

    printf("enter elements %d:");
    for(int i=0;i<n;i++){
        arr[i]=(int*)malloc(n * sizeof(int));
        // scanf("%d",&arr[i]);
    }

    printf("enter the element you want to search:");
    scanf("%d",&num);
    searcharray(arr,n,num);
    
}

void searcharray(int *arr,int n,int num)
{
    int flag=0,i;
    for( i=0;i<n;i++)
    {
        if(arr[i]==num)
        {
            flag=1;
            break;
        }
    }

    if(flag==0)
        printf("not found",num);
    else
        printf("%d found in the array at position %d\n ",num,i);
       
    }
