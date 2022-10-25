	#include<iostream>
using namespace std;

class Base1{  //9
	int x;
	string str;
	public:
		Base1(int x1, string str1){  //8    10Execute
			cout<<"\nBase1 constructor";
			x=x1;
			str=str1;
		}
		void disp1()
		{
			cout<<"\n x ="<<x;
			cout<<"\n str ="<<str;
				
		}
};
class Base2{ //5
	int y;
	public:
		Base2(int y1){  //4   6. Execute
			cout<<"\nBase2 constructor";
			y=y1;
		}
		void disp2()
		{
			cout<<"\n y ="<<y;
				
		}
};

class Derived:public Base2, Base1{//3   //7Back     11Back   
	float f;
	public:
		Derived(float f1, int x1, int y1, string str1):Base1(x1, str1),Base2(y1)  //2   //12Execute
		{
			cout<<"\nDerived constructor";
			f=f1;
		}
		void disp()
		{
			disp1();
			cout<<"\n f ="<<f;
				
		}
};
int main(){
	
	Derived d(2.4f, 3,4,"Hello");   //1    13Back
	
//	d.disp2();
//	d.disp();
	return 0;
}
