#include<stdio.h>
int getprimeno(int,int,int);
int main(){
    int start,end,pos;
    printf("Enter the start:");
    scanf("%d",&start);
    printf("Enter the end:");
    scanf("%d",&end);
    printf("Enter the position:");
    scanf("%d",&pos);

    int no=getprimeno(start,end,pos);
    printf("%d position prime number is %d",pos,no);
    
}
int getprimeno(int start,int end,int pos){
    int count=0;
        for(int i=start;i<=end;i++)
    {
    int no=i,flag=0;
        for(int j=2;j<no;j++)
    {
        if(no%j==0)
        {
            flag=1;
            break;
        }
    }
        if(flag==0)
    count++;

        if(count==pos)
    return no;
}
}