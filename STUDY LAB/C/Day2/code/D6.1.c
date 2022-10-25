#include<stdio.h>
//Example of goto
/*int main()
{
	int i,sum=0;
	for(i=1;i<=10;i++)
	{
		if(i==5)
		 goto addition;
		sum=sum+i;//sum= i=1 sum=1 i++ i=2 sum=3 i=3 sum=6 i=4 sum=10 i=5 sum15
		
		
	}
	
	
	 addition:
		printf("sum=%d",sum);
}*/
int main()
{
	int n=5,d=2;
	float n1=5.0;
	float res;
	//res=n/d;//2 res=2.000000  impilcit (compiler itself cast)
	res=(float)n/d;//5.0/2  res=2.500000 explicit(manually write syntax)
	//res=n1/d;
	printf("res=%f",res);
}
