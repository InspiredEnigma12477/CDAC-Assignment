#include<stdio.h>
//void display(int[]);
void display(int *);
int main()
{
	int marks[]={10,20,30,40,50,60},i;	
	display(marks);
}
/*void display(int m[])
{
	int i;
	for(i=0;i<6;i++)
	{
printf("Marks is %d subject=%d\n",i,m[i]);
	}
	
}*/
void display(int *m)
{
	int i;
	for(i=0;i<6;i++)
	{
printf("Marks is %d subject=%d\n",i,*(m+i));
	}
}
