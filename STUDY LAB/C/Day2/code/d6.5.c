#include<stdio.h>
//void swap(int,int)
void swap(int *,int *);
int main()
{
	int n1=10,n2=20;
	printf("Before calling swap() value of n1 & n2\n");
	printf("%d\t%d\n",n1,n2);
	swap(&n1,&n2);
	//swap(n1,n2);//actual argument
	printf("After calling swap() value of n1 & n2\n");
	printf("%d\t%d\n",n1,n2);
	
	return 0;
}
void swap(int *num1,int*num2)
//void swap(int num1,int num2)//formal argument
{
	/*int temp;----call by value
	temp=num1;//10
	num1=num2;//num1=20 num2=20
	num2=temp;//num2=10
	printf("inside swap() value of num1 & num2\n");
	printf("%d\t%d\n",num1,num2);*/
	
	int temp;
	temp=*num1;//10
	*num1=*num2;//num1=20 num2=20
	*num2=temp;//num2=10
	printf("inside swap() value of num1 & num2\n");
	printf("%d\t%d\n",*num1,*num2);
}
	
	
