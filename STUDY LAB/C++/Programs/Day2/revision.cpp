#include<iostream>
using namespace std;

class Date{
	int d,m,y;
	public:
	Date(){
		this->d=9;
		this->m=9;
		this->y=2022;	
	}
	Date(int d,int m,int y){
		this->d=d;
		this->m=m;
		this->y=y;	
	}
	Date(Date &obj){
		this->d=obj.d;
		this->m=obj.m;
		this->y=obj.y;	
	}

	void display(){
		cout<<"\nToday's Date : "<<d<<"-"<<m<<"-"<<y;
	}	
};

int main(){
	
	Date d1(10,9,2022),d2,d3(d2);
	d1.display();
	d2.display();
	d3.display();
	return 0;
}
