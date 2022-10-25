//--------------Pointer to Structute------------------------------------
#include<stdio.h>

typedef struct Student
{
int rollno;
char name[20];
float marks;
}Stud;
void display(Stud []);//void display(Stud *);//Passing array of structure to function
int main()
{
	/*Stud *sp,s;//pointer to structure
	
	sp=&s;
	printf("\nEnter the Roll no::");
	fflush(stdin);
	scanf("%d",&sp->rollno);
    printf("\nEnter the name::");
	fflush(stdin);
	gets(sp->name);
	printf("Enter total marks");
	scanf("%f",&sp->marks);
	printf("%d\t%f\n",sp->rollno,sp->marks);
	puts(sp->name);*/
	//------------------- Array of Structure----------------------------------
	Stud s1[2];//array of structure
	int i;
	for(i=0;i<2;i++)
	
	{
	 
	printf("\nEnter the name::");
	fflush(stdin);
	gets(s1[i].name);
	printf("\nEnter the Roll no::");
	scanf("%d",&s1[i].rollno);
	printf("\nEnter the Marks::");
	scanf("%f",&s1[i].marks);
	
}
/*printf("\n\n Name\t\tRoll no\t\tMarks\n\n");
for(i=0;i<2;i++)
{
	
	printf("\n%s\t\t%d\t\t%f\t\t",s1[i].name,s1[i].rollno,s1[i].marks);
}*/
display(s1);//passing array of struture

}
void display(Stud s1[])//void display(Stud *s1)
{
	int i;
printf("\n\n Name\t\tRoll no\t\tMarks\n\n");
for(i=0;i<2;i++)
{
	
	printf("\n%s\t\t%d\t\t%f\t\t",s1[i].name,s1[i].rollno,s1[i].marks);
}	
}
