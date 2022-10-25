//----Simple Macro-----------
#include<stdio.h>
/*#define MSG "Hello I am Macro in my program\n"
#define CHAT "HI & HELLO\n"
#define PRINT printf("I am in printf\n")
#define A 10
#define B 20
 
#define BEGIN int main(){
#define END }	

 
  
  
 BEGIN 
 
   int arr[A];
	printf(MSG);
	printf(CHAT);
	PRINT;
	printf("%d",sizeof(arr));
	return 0;

END*/
 
//-----Macro with argument

#define SUM(x,y) ((x)+(y))
#define MUL(x,y)  (x*y)
#define MAX(x,y)((x)>(y)?(x):(y))
#define ISLOWER(ch)  ((ch>=97 && ch<=122))
#define PI 3.14
//#undef PI
#define CIRCLE(r) (PI*(r)*(r))
/*int main()
{
int s,add,pro,n1=5,n2=4,m;
float p=1.2,q=3.5;
char ch1='A',ch2='B',ans='a';	
s=SUM(n1,n2);
printf("Sum=%d\n",s);
//printf("%d\n",SUM(n1,n2));
printf("%f\n",SUM(p,q));
printf("%c\n",SUM(ch1,ch2));
//m=MAX(10,20);
//printf("Maximum no is=%d\n",m);
}*/
//----Lower---------------------
/*if((ISLOWER(ans)))
{
	printf("Lowercase\n");
}
else
{
	printf("Uppercase");
}*/
//printf("Area of Circle=%f",CIRCLE(2));
//}
//-------#ifdef---------
//#define NOINPUT
#undef NOINPUT
/*int main()
{
int a=1;
#ifdef NOINPUT
a=2;
printf("value of a=%d\n",a)	;
#else
printf("Enter the value of a");
scanf("%d",&a);
printf("value of a=%d\n",a)	;
#endif
}*/
//------------#ifndef-----------
//#define NOINPUT
//#undef NOINPUT
/*int main()
{
int a=1;
#ifndef NOINPUT
a=2;
printf("value of a=%d\n",a)	;
//#elif 
#else
printf("Enter the value of a");
scanf("%d",&a);
printf("value of a=%d\n",a)	;
#endif
}*/
 //------Predefined Macro  Names
 #include<stdio.h>
 int main()
 {
 	printf("%s\n",__DATE__);
 	printf("%s\n",__TIME__);
 	printf("%s\n",__FILE__);
 	printf("%d\n",__LINE__);
 	 
 }


