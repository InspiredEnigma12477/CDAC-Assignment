#include<stdio.h>
#include<stdlib.h>
int main()
{
	int **ptr,norows,nocols,i,j;
	int sum = 0;
	printf("Enter the no. of rows");
	scanf("%d",&norows);
	printf("Enter the no. of Columns");
	scanf("%d",&nocols);
	ptr=(int**)malloc(sizeof(int*)*norows);
	for(i=0;i<norows;i++)
	{
		ptr[i]=(int*)malloc(sizeof(int)*nocols);

	}
	printf("Enter the Elements");
	for(i=0;i<norows;i++)
	{
		for(j=0;j<nocols;j++)
		{
			scanf("%d",(ptr[i]+j));
		}
	}
	printf("DisPlay\n");
	for(i=0;i<norows;i++)
	{
		for(j=0;j<nocols;j++)
		{
			printf("%d\t",*(ptr[i]+j));
			printf("%d\t",(ptr[i]+j));
		}
		printf("\n");
	}
	for(i=0;i<norows;i++)
	{
		free(ptr[i]);
	}
}
