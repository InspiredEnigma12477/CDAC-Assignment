#include<stdio.h>
int main()
{
	int i,j;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{

		if(j==3)
		{
			//break;
			continue;
		}
		printf("%d\t",j);
	}
	printf("\n");
	}
	return 0;
}
