#include<iostream>
using namespace std;
class Test
{
	int x;
	public:
	Test(){
		cout<<this->x<<endl;
	}	
	void show(){
		cout<<this->x;
	}
};
int main(){
	Test t,t2;
	cout<<&t;
	t2.show();
	
	return 0;
}
