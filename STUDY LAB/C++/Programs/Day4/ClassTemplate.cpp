#include<iostream>
using namespace std;

template<class T>
class Demo{
	T x,y;
	public:
		Demo(T,T);
	
		
		void show(){
			cout<<"\n x= "<<x;
			cout<<"\n y= "<<y;
		}
		T add();

};
template<class T>
Demo<T>::Demo(T x1,T y1)
{
			x=x1;
			y=y1;
}

template<class T>
T Demo<T>::add(){
	return x+y;
}
int main(){
	
	Demo <int>d(3,4);   //constructor call
	d.show();
	cout<<"\nAddition of int ="<<d.add();
	
	
	Demo <float>d1(3.2,4.4);
	d1.show();
	cout<<"\nAddition of Float ="<<d1.add();
	
	Demo <string>d2("Hello", " World");
	d2.show();
	cout<<"\nAddition of string ="<<d2.add();
	

	
	return 0;
}
