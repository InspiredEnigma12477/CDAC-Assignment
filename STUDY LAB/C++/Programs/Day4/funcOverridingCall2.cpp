#include<iostream>
using namespace std;
class A{
	public:
	 void disp(){
		cout<<"\nA's Display";
	}
};
class B{
	public:
	 void disp(){
		cout<<"\nB's Display";
	}
};
class C:public A,public B{
	public:
	 void disp(){
		cout<<"\nC's Display";
	}
};
int main(){
	C obj;
	obj.disp();
//	obj.A::disp();

//	obj.B::disp();
	return 0;
}














