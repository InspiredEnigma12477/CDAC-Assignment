#include<iostream>
using namespace std;
class Meter;   //Forward Declaration

class KiloMeter{
	int km;
	public:

	void display(Meter);
	void convert(Meter);
};
class Meter{
	int m;
	public:
	Meter(int m)
	{
		this->m=m;	
	}	
	friend KiloMeter;
};
void KiloMeter::convert(Meter obj){
	km=obj.m/1000;
}
void KiloMeter::display(Meter obj){
	cout<<"\nDistance in Meter : "<<obj.m;
	cout<<"\nDistance in KiloMeter : "<<km;
}

int main(){
	Meter m(4000);
	KiloMeter kmobj;
	kmobj.convert(m);
	kmobj.display(m);
	
	return 0;
}
