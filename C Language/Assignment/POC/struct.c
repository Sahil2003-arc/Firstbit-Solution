#include<stdio.h>

typedef struct employee
{
    int id;
    char name[20];
    double salary;
}employee;

void main()
{
    employee arr[5];
    for(int i=0;i<5;i++)
	{
        printf("Enter the employee details:");
        scanf("%d",&arr[i].id);
        scanf("%s",arr[i].name);
        scanf("%lf",&arr[i].salary);
    }  

    int no, flag=0;   //flad=0 not needed
    printf("Enter the employee id to search: ");
    scanf("%d",&no);
    for(int i=0;i<5;i++)
	{
        if(arr[i].id==no)
		{
            printf("Employee found:\nid=%d\nname=%s\nsalary=%.2lf\n",arr[i].id,arr[i].name,arr[i].salary);
            flag=1;  //index=i;
            break;
        }
    }

    if(flag==0)    //index==-1;
    printf("Employee not found\n");
    //else
    //printf("employee found %s",arr[index].name);
}

