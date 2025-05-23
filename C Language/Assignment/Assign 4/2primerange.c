#include <stdio.h>
void main(){
    int no,count=0;

    printf("Enter the range:");
    scanf("%d",&no);

    for(int num=2;num<=no;num++)
    {
        count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            printf("%d\n",num);
        }
    }
}
