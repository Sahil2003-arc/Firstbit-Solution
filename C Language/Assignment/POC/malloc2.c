#include <stdio.h>
#include <stdlib.h>
int main() {
    int size;
    printf("Enter the size of the array: ");
    scanf("%d",&size);

    int* ptr=(int*)malloc(sizeof(int)*size);

    printf("Enter %d elements:\n",size);
    for(int i=0;i<size;i++)
    {
        scanf("%d",&ptr[i]);
    }

    for(int i=0;i<size/2;i++)
    {
        int temp=ptr[i];
        ptr[i]=ptr[size-i-1];
        ptr[size-i-1]=temp;
    }

    printf("Reversed array:\n");
    for(int i=0;i<size;i++)
    {
        printf("%d ",ptr[i]);
    }
    printf("\n");
    free(ptr); 
    return 0;
}
