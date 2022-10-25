#include<stdio.h>
int main()
{
int n=10,d=20;
int *p;//pointer variable

//p=&n;
/*printf("%d\n",n);//10
printf("%u\n",&n);//Address of n
printf("%u\n",&p);//Address of p
printf("%u\n",p);//address of n
printf("%d\n",*p);//value  which pointed by pointer i.e 10*/
printf("%d\t%d",sizeof(p),sizeof(*p));//check with different data type...
/*p=&d;
printf("%d\n",d);//
printf("%u\n",&d);//Address of 
printf("%u\n",&p);//Address of p
printf("%u\n",p);//address of 
printf("%d\n",*p);//value  which pointed by pointer i.e */

return 0;



	
}
