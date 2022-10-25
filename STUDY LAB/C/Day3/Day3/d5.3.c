#include<stdio.h>
int main()
{
	int arr[][2]={10,20,30},r,c;
	printf("Enter the elements");
	/*for(r=0;r<3;r++)
	{
		for(c=0;c<2;c++)
		{
			//scanf("%d",&arr[r][c]);
			scanf("%d",*(arr+r)+c); 
		}
	}*/
	printf("2d array as follow:-\n");
	for(r=0;r<3;r++)
	{
		for(c=0;c<2;c++)
		{
			//printf("%d\t",arr[r][c]);
			//printf("%d\t",*(arr+r)+c);
			printf("%d\t %d\t",*(*(arr+r)+c),*(arr+r)+c);
		       //printf("%d\t",*(arr+r)+c);//row address
		       //printf("%d\t",(arr+r));
			
			
		}
		printf("\n");
	}
	//printf("%d",*(arr+1)+1);
	//printf("%d",*(*(arr+1)+1));
}
