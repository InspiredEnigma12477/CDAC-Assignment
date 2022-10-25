#include<iostream>
using namespace std;
class A{
	public:
	virtual void disp(){
		cout<<"\nA's Display";
	}
};
class B:public A{
	public:
	 void disp(){
	 	A::disp();
		cout<<"\nB's Display";
	}
};
int main(){
	B obj;
	obj.disp();
	//obj.A::disp();
	A *ptr=new B;
	ptr->disp();
	return 0;
}
