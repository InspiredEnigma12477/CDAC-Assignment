#include<iostream>
using namespace std;
class Shape{
	public:
	virtual	void area(){   // it will check is it a virtual function
			cout<<"\n This is Shape's Area function";
		}
	virtual	void disp()
		{
			cout<<"\n Display of Shape";
				
		}
};
class Circle:public Shape{
	float r;
	public:
		Circle(float r1){
			r=r1;
		}
		void disp()
		{
			cout<<"\n radius ="<<r;
				
		}
		void area(){
			cout<<"\nArea of Circle = "<<3.14*r*r;
		}
};
class Rectangle:public Shape{
	float l,b;
	public:
		Rectangle(float l1,float b1){
			l=l1;
			b=b1;
		}
		void disp()
		{
			cout<<"\n Length ="<<l;
			cout<<"\n breadth ="<<b;
		}
		void area(){
			cout<<"\nArea of Rectangle = "<<l*b;
		}
};
int main(){
	
	Shape *p;
	Circle c(5);
	p=&c;        //compiler always check for type of pointer varible and go and call that class functions
	c.disp();
	c.area();
	p->disp();
	p->area();
	
	return 0;
}









