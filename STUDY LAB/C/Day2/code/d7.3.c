#include<stdio.h>
  static int n;//global int
void display();
void show();
int main()
{
	display();
	display();
	display();
	show();
}
void display()
{ //int n=5;
	//static int n=5;
	
	printf("%d\n",n);
	n++;
}
void show()
{
	printf("Show-----\n");
	printf("%d\n",n);
}
