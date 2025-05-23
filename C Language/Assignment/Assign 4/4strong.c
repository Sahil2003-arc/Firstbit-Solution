#include <stdio.h>
int main() {
    int n;
    printf("Enter the value of n: ");
    scanf("%d",&n);

    printf("Strong numbers from 1 to %d are:\n",n);

    for (int i=1;i<=n;i++)
    {
        int temp=i,sum=0;
        while (temp>0)
        {
            int digit=temp%10;
            int fact=1;
            for (int j=1;j<=digit;j++)
            {
                fact*=j;
            }

            sum += fact;
            temp /= 10;
        }

        if (sum==i)
        {
            printf("%d ",i);
        }
    }
    return 0;
}
