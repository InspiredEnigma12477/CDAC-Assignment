#include <iostream>

using namespace std;

class A{
	int x, *p;
	public:
	A(int x1, int *p1){
		x=x1;
		p=p1;
	//	p=new int(p1) ;
	}

	A(A& obj){
		x=obj.x;
		//p=obj.p;
		p=new int(*obj.p) ;
		
	}
void disp(){
	cout<<"\n x = "<<x;
	cout<<"\n p = "<<*p;
	cout<<"\nAdd of p  ="<<p;
}	
	
};
int main()
{
	int x=10;
	int *p=&x;
	cout<<"\nAdd of x  ="<<&x;
	A obj1(2,p), obj2(obj1);
	obj1.disp();
	obj2.disp();
	return 0;
}
