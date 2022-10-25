#include<iostream>
using namespace std;
class A
{
	int x,y;
	public:
//		A(){ //default constructor
// 			x=y=9;
//		}
	//	A(int x1=9,int y1=8){ //parameterize constructor
 	//		x=x1;
	//		y=y1;
	//	}
	void disp()
	{
		cout<<"\n x= "<<x<<"\n y = "<<y;	
	}
};
int main(){
	A o,o1;
	o.disp();
	o1.disp();
	return 0;
}
