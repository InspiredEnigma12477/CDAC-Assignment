#include<stdio.h>//declaration of inbulid functions()
float add(int,int);//function declaration/prototype
int main()
{
	int num1=20,num2=3;
	float c,d;
	c=add(num1,num2);//function call
	d=add(30,6);
	
	printf("result is=%f\n",c);
	printf("result is=%f\n",d);
	printf("result is=%f\n",add(40,4));
	
	printf("\n----- in main function & program end------");
	return 0;
}
float add(int n1,int n2)
{
	 int a,d,e,c;
	 
	a=n1+n2;
	d=n1/n2;
	return a,d;
	//printf("Addition%d",a);
}
//---fun without agrument & without return
/*void factorial();
int main()
{
factorial();
return 0;	
}
void factorial()
{
	int num,i,f=1;
printf("enter the number");
scanf("%d",&num);
for(i=1;i<=num;i++)
{
f=f*i;	
}
printf("Factorial of a %d is=%d",num,f);

}*/
//function without arguments and with return value
//int factorial()
/*int main()
{
	
}*/

