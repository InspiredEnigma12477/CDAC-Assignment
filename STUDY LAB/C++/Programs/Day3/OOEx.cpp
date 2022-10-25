#include<iostream>
using namespace std;
class Complex{
	int real,img;
	public :
	Complex(){
		real=img=0;
	}	
	Complex(int , int );
	void disp(){
		cout<<real<<" + "<<img<<"i"<<endl;
	}
	Complex operator+(Complex);
	friend Complex operator-(Complex,Complex);
};
Complex::Complex(int r, int i){
			real=r;
			img=i;
}

Complex Complex::operator+(Complex c2){
	Complex c;
	c.real=real+c2.real;
	c.img=img+c2.img;
	return c;
}
Complex operator-(Complex c1,Complex c2){
	Complex c;
	c.real=c1.real-c2.real;
	c.img=c1.img-c2.img;
	return c;
}

int main(){
	Complex c1(2,4),c2(3,6);
	c1.disp();
	c2.disp();	
	
	Complex c3=c1+c2;    //will call OO function
	c3.disp();
	
	Complex c4=c1-c2;    //will call OO function
	c4.disp();
	return 0;
}
