#include<iostream>
using namespace std;
class Demo{
	//public:
	int x,y;
	public:
		Demo(int x1,int y1){
			x=x1;
			y=y1;
		}
		void display(){
			cout<<"\nx= "<<x;
			cout<<"\ny= "<<y;
		}
		friend void addition(Demo);
};
void addition(Demo obj){
	cout<<"Addition  ="<<obj.x+obj.y;
}
int main(){
	Demo o(4,4);
	//Demo o(4,4);
	addition(o);
	return 0;
}
