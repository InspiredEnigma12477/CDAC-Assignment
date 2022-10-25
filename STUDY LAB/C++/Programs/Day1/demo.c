#include<stdio.h>
struct stud{
	char nm1[12];
	int r;
	char nm[12];
}s;
int main(){
	
	printf("\n%d",sizeof(s));
	int const x=9;
	float f=(float)8/9;
	
	printf("\n%f",f);
	return 0;
	
}
