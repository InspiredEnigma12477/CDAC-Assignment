printf("upper case");#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
	char *str;
	char temp[10];
	int len;
	printf("\nEnter the string");
	gets(temp);
	len=strlen(temp);
	str=(char *)malloc(len);
	strcpy(str,temp);
	printf("\nString is=");
	puts(str);
}
