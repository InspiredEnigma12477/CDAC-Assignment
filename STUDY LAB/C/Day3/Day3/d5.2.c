#include<stdio.h>
#include<string.h>
int main()
{ char ch='\0';
	char name[10],i;
	printf("Enter the name\n");
	//scanf("%s",name);
	//printf("\n%s",name);
	for(i=0;i<10;i++)
	{
		scanf("%c",&name[i]);
	}
	name[i]='\0';
	//gets(name);
	//puts(name);///unformatted i/o
	//putchar(ch);
//---------------------Strlen()-----------
/*char str1[20],str2[10];
int len;
printf("Enter the string");
gets(str1);
len=strlen(str1);
printf("%d",len);*/
//----------------------strcpy-----------	
/*	char str1[20],str2[10];
	printf("Enter the string1");
	gets(str1);
	printf("Enter the string2");
	gets(str2);
	printf(" Before copy String1=%s\n",str1);
	printf(" Before copy String2=%s\n",str2);
	strcpy(str1,str2);//str1=str2//not allowed
	printf("After Copy\n");
	printf("String1=%s\n",str1);
	printf("String2=%s",str2);*/
	//----------------------strcat-------------
/*char str1[20],str2[10];
	printf("Enter the string1");
	gets(str1);
	printf("Enter the string2");
	gets(str2);	
	printf(" Before concate String1=%s\n",str1);
	printf(" Before concate String2=%s\n",str2);
	strcat(str1,str2);
	printf("After concate\n");
	printf("String1=%s\n",str1);
	printf("String2=%s",str2);*/
	//--------------------------------Strcmp----------------
	//int strcmp(const char *string1,const char *string2)
	//compare two strings character by character and returns -1,1 or 0 when it find 
	//the first non matching character
//	int i;
	//i=strcmp("Apple","Zoo");//i=-1 String1 is smaller than string2
	//printf("%d",i);
	//i=strcmp("Zoo","Apple");//i=1 String1 is greater than string2
//	printf("%d",i);
	//i=strcmp("Apple","Apple");//i=0 string 1 is equal to string2
	//printf("%d",i);
//i=strcmp("apple","Apple");
//printf("%d",i);
//i=strcmp("Ball","Apple");
//printf("%d",i);
//i=strcmp("App","Apple");
//printf("%d",i);
//i=strcmp("APP","App");
//printf("%d",i);
//---------------------strrev---------
/*char str1[20];
printf("Enter the string");
gets(str1);
printf("%s",strrev(str1));*/
return 0;
}
