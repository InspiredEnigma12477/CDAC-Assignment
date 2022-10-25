#include<iostream>
using namespace std;
class Test{
	int x,y;
	void increament(){    //helper function
		x++;
	}
	public:
		void setX(int x1)  //Mutator function
 		{
			x=x1;
		}
		int getX(){   //Accessor function
			return x;
		}
		
		void display(){ //facilitator function
 			cout<<"\nx= "<<x;
			cout<<"\ny= "<<y;
			increament();
			cout<<"\n Incremented value  ="<<x;
		}
};
int main(){
	Test o;
	o.setX(44);
	cout<<"\n x = "<<o.getX();
	o.display();
	
}
