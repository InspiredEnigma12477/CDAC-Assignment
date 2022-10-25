#include<iostream>
using namespace std;
class A
{
	int x;
	static int num;
	public:
		A(int x1)
		{
			num++;
			x=x1;
		}
		~A(){
			cout<<"\nDestructor is called for "<<num--;
		}
};
 int A::num=0;
int main(){
	A obj1(3), obj2(4);
	{
		A obj3(3);
	}

	return 0;
}
