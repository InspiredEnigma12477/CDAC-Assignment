#include<stdio.h>
#include<stdlib.h>
typedef struct Employee
{
int empid;
char name[20];
float sal;
}EMP;
void accept(EMP *,int);
void display(EMP *,int);
int main()
{
int num;
EMP *pe;
printf("Enter the the no of employee::");
scanf("%d",&num);
pe=(EMP *)malloc(num*sizeof(EMP));	 
	 
	accept(pe,num);
	display(pe,num);
}
void accept(EMP *e,int n)
{
	int i;
	for(i=0;i<n;i++)
	{
	printf("Enter the empid:");
	scanf("%d",&e[i].empid);
	printf("Enter the EMployee name:");
	fflush(stdin);
	gets(e[i].name);
	printf("Enter the Salary:");
	scanf("%f",&e[i].sal);
	}
}
void display(EMP *e,int n)
{ int i;
	for(i=0;i<n;i++)
	{
	printf("\n\nEMPID\t\tEMPNAME\t\tSALARY\n");
	printf("%d\t\t%s\t\t%f",e->empid,e->name,e->sal);
	e++;
}
}
