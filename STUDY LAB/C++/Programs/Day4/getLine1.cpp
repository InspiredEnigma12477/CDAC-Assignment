#include <iostream>
#include <string>
using namespace std;
class A{
	string n;
	public:
		void set(){
			cout<<"\n Enter name";
			getline(cin,n);
		
			
		}
		void get()
		{
			cout<<n;
		}
};
int main ()
{


A o;
o.set();
o.get();
}
