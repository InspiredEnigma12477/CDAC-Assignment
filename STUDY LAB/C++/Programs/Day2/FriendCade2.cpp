#include<iostream>
using namespace std;
class Meter;   //Forward Declaration

class KiloMeter{
	int km;
	public:

	void display(){
		cout<<"\nDistance in KiloMeter : "<<km;
	}
	void convert(Meter);
};
class Meter{
	int m;
	public:
	Meter(int m)
	{
		this->m=m;	
	}	
	void display(){
		cout<<"\nDistance in Meter : "<<m;
	}
	friend void KiloMeter::convert(Meter);
};
void KiloMeter::convert(Meter obj){
	km=obj.m/1000;
}

int main(){
	Meter m(4000);
	m.display();
	KiloMeter kmobj;
	kmobj.convert(m);
	kmobj.display();
	
	return 0;
}
