#include<iostream>
using namespace std;

namespace A{
	class Test{
		public:
		void fun(){
			cout<<"\nHello";
		}
	};
	void msg(){
		cout<<"\nHello Good Afternoon ";
	}
}
//using namespace A;
int main(){
	
	A::Test t;
	t.fun();
	A::msg();
	return 0;
}
