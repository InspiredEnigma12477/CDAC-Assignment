#include<iostream>
using namespace std;
class Date{
	int d,m,y;
	public:
	void setD(int d1){
		d=d1;
	}
	void setM(int m1){
		m=m1;
	}
	void setY(int y1){
		y=y1;
	}
	int getD(){
		return d;
	}
	int getM(){
		return m;
	}
	int getY(){
		return y;
	}
	void display(){
		cout<<"\nToday's Date : "<<d<<"-"<<m<<"-"<<y;
	}	
};

int main(){
	
	Date d1;
	d1.setD(9);
	d1.setM(9);
	d1.setY(2022);
	d1.display();
	cout<<"\nToday's Date : "<<d1.getD()<<"-"<<d1.getM()<<"-"<<d1.getY();
	return 0;
}
