#include<stdio.h>
//enum actype{SAVEING,FIXED,RECURRING};
enum day{MON,TUE,WED=10,THR,FRI,SAT,SUN};//bydefault 0

typedef struct employee
{
	int empid;
	char name[20];
	//enum actype at;
	enum day d;
}Emp;
int main()
{
Emp e;
/*printf("Enter the name:");
	fflush(stdin);
	gets(e.empname);
	printf("Enter the empid:");
	scanf("%d",&e.empid);*/
/*	e.at=SAVEING;
	printf("%d\t",e.at)	;
	e.at=FIXED;
	printf("%d\t",e.at)	;*/
	e.d=MON;
	printf("%d\t",e.d);
	e.d=TUE;
	printf("%d\t",e.d);
	e.d=SUN;
	printf("%d\t",e.d);
}
