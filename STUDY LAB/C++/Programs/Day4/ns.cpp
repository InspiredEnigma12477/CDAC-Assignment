#include <iostream>
using namespace std;
// first name space
namespace first_space
{
  void func()
  {
     cout << "Inside first_space" << endl;
  
  }
  class A{
  	public:
  	void disp(){
  		cout<<"\nhello";
	  }
  };
}
 
// second name space
namespace second_space
{
  void func()
  {
     cout << "Inside second_space" << endl;
  }
}
using namespace first_space;
int main ()
{
   // This calls function from first name space.
   A o;
   o.disp();
  func();
  return 0;
}

