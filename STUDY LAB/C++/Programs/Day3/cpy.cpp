#include<iostream>
using namespace std;
class A{
	int x;
	int *p;
	public:
		A(int x1, int *p1)
		{
			x=x1;
			p=p1;
		}
		void disp(){
			cout<<x<<"  "<<*p;
		}
};
int main(){
	//int x=8;
	A o(2,&x);
	o.disp();
	return 0;
}
