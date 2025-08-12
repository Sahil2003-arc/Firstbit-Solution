#include<stdio.h>
int main(){
    int start,end;
    printf("Enter the start range: ");
    scanf("%d",&start);
    printf("Enter the end range: ");
    scanf("%d",&end);

    for(int i=start;i<=end;i++)
    {
        printf("Factors of %d: ",i);
        for(int j=1;j<=i;j++)
        {
            if(i%j==0){
                printf("%d ",j);
            }
        }
     printf("\n");
    }
 return 0;
}

