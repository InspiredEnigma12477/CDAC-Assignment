#include<iostream>
#pragma pack(1)
using namespace std;
class Base{
	
	static int x;
	public:

	void setB(int x1=0){
		x=x1;
	} 
	void show(){
		cout<<"\nx ="<<x;
	}
};

class Derived:public Base
{
	int y;
	public:
	void setD(int y1=0){
		y=y1;
	} 
	void display(){
		cout<<"\ny ="<<y;
	}	
};
int main(){
	Base b;
	Derived d;

	d.setB(2);
	d.setD(4);
	d.show();
	d.display();
	//b.setB(9);
	b.show();	
	return 0;
}
