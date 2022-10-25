#include<stdio.h>
/*int main()
{
	int i;
	for(i=0;i<20;i++)//i=i+1
	{
		//printf("Hello\n");
		printf("%d\n",i);
	
	}
	return 0;
}*/

/*int main()
{
	int i;
	//i=1;
	for( ; ; )//infinite loop
		 printf("%d\n",i);
		
		return 0;
	
}*/
/*int main()
{
	int i;
	for(i=1;i<10;i++); i=1 i=2 i=3 4 5 6 7 8 9 i=10
	{
		printf("%d\n",i);
	}
	return 0;
}*/
/*int main()
{
	int i,num;
	for(i=1;i<=10;i++)//pre tested
	{
		printf("Enter the Number%d",i);
		scanf("%d",&num);
		printf("%d\n",num);
	}
	return 0;
}*/
/*int main()
{
	int i,j;
	for(j=0,i=5;j<i;j=j+2,i++) //multiple intilize  & multiple increment or decrement 
	{
		printf("%d %d\t",i,j);
	}
	return 0;
}*/
//-------------------While----------------------------
/*int main()
{
	int i=1;//intilzation
	while(i<10)//condition
	{
		printf("%d\t",i);
		i++;//iteration increment or decrement
	}
	return 0;
}*/
//---------------do while-----------------
int main()
{
	int i=1;
	do
	{
		printf("%d\t",i);
		i++;
	}while(i>10);
	return 0;
}



