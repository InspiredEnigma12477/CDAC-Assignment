#include<stdio.h>
int main()
{
	char ch;
	int n1,n2;
	printf("Select the choices  from below\n");
	printf("Press + for addition\n");
	printf("Press - for Subtraction\n");
	printf("Press * for Multipliction\n");
	printf("Press / for Division\n");
	//printf("Press % for remainder\n");
	printf("Enter the Choice");
	scanf("%c",&ch);
	printf("Enter the 2 number");
	scanf("%d%d",&n1,&n2);
	switch(ch)
	{
		case '+':
		printf("Addition=%d",n1+n2);
		break;
		case '-':
		printf("Subtraction=%d",n1-n2);
		break;
		case '*':
		printf("Multipliction=%d",n1*n2);
		break;
		case '/':
		printf("Division=%d",n1/n2);
		break;
		case '%':
		printf("Remainder=%d",n1%n2);
		break;
		default:
			printf("Invalid choice");
			
	}
	return 0;
	
}
