#include<stdio.h>
int fact(int);
int main()
{
int n;
printf("Enter the number");
scanf("%d",&n);
//fact(n)	;
printf("Factorial of %d is %d",n,fact(n));
}
int fact(int num)
{
if(num==0)
{
	return(1);
	
}
else
{
	return (num*fact(num-1));//(5* fact(5-1));fact(4*fact(4-1))(3*fact(3-1))(2*fact(2-1))fact(1*fact(1-1)
	
}
}
	/* int i,f=1;
	 for(i=1;i<=num;i++)
	 {
	 	f=f*num;
	 	
	 }
	 printf("%d",num);*/
	

