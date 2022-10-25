#include<iostream>
using namespace std;
void area(int,float pi=3.14);  //declaration /prototype
int main23(){
	int r;
	cout<<"\n Enter a radius";
	cin>>r;
	area(r);
	return 0;
}
void area(int r,float pi){ //defination  //catch by ref
	cout<<"\n Circle Area ="<<pi*r*r;
}

