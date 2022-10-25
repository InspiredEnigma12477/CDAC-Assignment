#include<stdio.h>
#include<string.h>
//int main()
//{
//	char name[10];
//	int i;
//	char *p;
//	p=name;
//printf("Enter name");
//gets(p);
//scanf("%s",name);
//scanf("%s",name);

/*for(i=0;i<10;i++)
{
	scanf("%c",&name[i]);
}*/
//name[i]='\0';
//puts(p);
//printf("%s",p);
//}

int main()
{

char name[10];
char str1[10],str2[20];
	int i;
	//printf("Enter String1\n");
	//gets(str1);
   //printf(" Before copy String1 is%s\n",str1);
	//printf("Enter String2\n");
	//gets(str2);
	//---------------Strcpy------------
//	printf(" Before copy String2 is%s\n",str2);
	//strcpy(str2,str1);
	//printf(" After String1 is%s\n",str1);
	//printf(" After String2 is%s\n",str2);
	//----------------Strcat---------------------
/*	printf(" Before concate String1 is%s\n",str1);
	printf(" Before concate String2 is%s\n",str2);
	strcat(str2,str1);
	printf(" After String1 is%s\n",str1);
	printf(" After String2 is%s\n",str2);*/
//--------------strlen--------------------	
	//i=strlen(name);
	//printf("Length=%d",i);
	//-------------strrev-------------------
/*	printf("Enter String1\n");
	gets(str1);
	printf("%s",strrev(str1));*/
	//-------------Strcmp----------
	//compare two string character by character and return -1,1 or 0 when it find 
	//first non matching characters.
	int a;
	a=strcmp("Apple","Zebra");//string1 is less than string2: returns -ve value(-1) 
	printf("%d",a);
	a=strcmp("Apple","apple");//-1
	printf("%d",a);
	a=strcmp("Apple","Apple");//str1==str2 value 0
	printf("%d",a);
	a=strcmp("Ball","Apple");
	printf("%d",a);//1 string 1 is greater than string2 value is 1

}
