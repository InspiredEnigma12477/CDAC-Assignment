#include<stdio.h>
void display();
int k=10;
int main()
{
	extern int k;
display();	
}
void display()
{  
	printf("%d\n",k);
	
}
