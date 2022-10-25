#include<stdio.h>
//int sstrlen(char[]);
int sstrlen(char *);
int main()
{
	char name[10];
	int length;
	printf("Enter String1\n");
	gets(name);
	length=sstrlen(name);
	printf("Length is=%d",length);
}
//subscript[]operator square bracket
/*int sstrlen(char s[])
{
int i=0,len=0;
while(s[i]!='\0')
{
	i++;
	len++;
}
return len;	
}*/
int sstrlen(char *s)
{
int i=0,len=0;
while(*s!='\0')
{
	s++;
	len++;
}
return len;	
}
