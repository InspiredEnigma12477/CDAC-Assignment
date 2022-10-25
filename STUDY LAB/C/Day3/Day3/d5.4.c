#include<stdio.h>
#include<stdlib.h>
int main()
{
	int *ptr,n,i;
	printf("how many integer elements do u want to insert:-");
	scanf("%d",&n);
	ptr=(int*)malloc(n*sizeof(int));
	//ptr=(int*)calloc(n,sizeof(int));
	if(ptr==NULL)
	{
		printf("Memory not available\n");
		exit(1);//end the program
		
	}
	for(i=0;i<n;i++)
	{
		printf("Enter the number:");
		scanf("%d",ptr+i);//ptr[i];
		
	}
	for(i=0;i<n;i++)
	{
		printf("%d\t",ptr[i]);
	}
	free(ptr);
}
	
