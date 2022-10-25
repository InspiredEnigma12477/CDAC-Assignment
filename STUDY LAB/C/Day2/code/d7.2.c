#include<stdio.h>
int n=30;//global 
void fun();
int main()
{
	 extern int n;
	 //extern int n;//in main
	printf("Value of n=%d\n",n);
	{
		int n=20;//in block
		printf("value of n inside block=%d\n",n);//auto nolinkage l
		
	}
	printf("value of n outside block=%d\n",n);
	fun();
	return 0;
}
void fun()
{
	 printf("value of n=%d\n",n);
}

	
