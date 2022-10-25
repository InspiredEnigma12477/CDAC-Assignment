#include<iostream>
using namespace std;
void swap(int *, int *);  //declaration /prototype
int main(){
	int a=9,b=7;
	cout<<"\na=  "<<a;
	cout<<"\nb=  "<<b;
	swap(&a,&b);  //pass value only   \\pass address
	cout<<"\na=  "<<a;
	cout<<"\nb=  "<<b;
	return 0;
}
void swap(int *x, int *y){ //defination  //catch by ref
	int t=*x;
	*x=*y;
	*y=t;
	
}

