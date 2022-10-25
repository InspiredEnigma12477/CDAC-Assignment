#include<iostream>
using namespace std;
void area(int,float pi=3.14);  //declaration /prototype

int main(){
	int r;
	cout<<"\n Enter a radius";
	cin>>r;
	area(r);
	return 0;
}
void area(int r,int pi){ //defination  //catch by ref
	cout<<"\n Circle Area ="<<pi*r*r;

}

