#include<iostream>
#pragma pack(1)
using namespace std;
class Base1{
	
	int x;
	public;

	Base1(){
		cout<<"\nBase1 Constructor";
	} 
	~Base1(){
		cout<<"\nBase1 Destructor";
	} 
};
class Base2{
	
	int x;
	public:

	Base2(){
		cout<<"\nBase2 Constructor";
	} 
	~Base2(){
		cout<<"\nBase2 Destructor";
	} 
};

class Derived:public Base1,Base2
{
	int x;
	public:
	Derived(){
		cout<<"\nDerived Constructor";
	} 
	~Derived(){
		cout<<"\nDerived Destructor";
	} 
};
int main(){
	
	Derived d;
		
	return 0;
}
