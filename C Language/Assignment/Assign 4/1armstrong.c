#include<stdio.h>
void main()
{
    for(int p=1;p<=1000;p++)
    {
        int n=p;
        int temp=n;
        int count=0;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
        temp=n;
        int sum=0;
        while(temp>0)
        {
            int rem=temp%10;
            int q=1;
            for(int i=1;i<=count;i++)
            {
                q=q*rem;
            }
            sum=sum+q;
            temp=temp/10;
        }
        if(sum==n)
        {
            printf("%d\n",n);
        }
    }
}