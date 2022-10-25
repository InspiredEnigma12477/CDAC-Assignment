#include<stdio.h>
char * sstrcopy(char [],char[]);
//char *sstrcopy(char *,char *);
int main11111()
{
	char str1[10],str2[20];
	int i;
	printf("Enter String1\n");
	gets(str1);
   
	printf("Enter String2\n");
	gets(str2);
	sstrcopy(str2,str1);//base address
	printf(" After String1 is%s\n",str1);
	//printf(" After String2 is%s\n",str2);
}
char * sstrcopy(char dest[],char src[])
//char * sstrcopy(char *dest, char *src)
{
	int i=0;
	//while(*dest=*src)!=0)
	while((dest[i]=src[i])!='\0')//str1/src=IACSD  Str2/dest=CDAC
	{
		//dest++//pointer notation
		//src++;
		i++;
	}
	return dest;
	
}
/* int sstrlen(char dest[])

{
int len=0,i=0; 
while(dest[i]!='\0')
{
i++
len++;
}
return len;
}


