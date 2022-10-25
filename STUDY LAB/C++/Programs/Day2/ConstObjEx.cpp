#include<iostream>
using namespace std;
class Date{
	int m,d,y;
	public:
		Date(int d1=6,int m1=4, int y1=2000)
		{
			d=d1;m=m1;y=y1;
		}
		void display() 	const
		{
			d=4;m=4;y=2022;  
		cout<<"\nToday's Date : "<<d<<"-"<<m<<"-"<<y;
		}
};
int main()
{
	Date const d;
	Date d1(2,2,2022);
	d.display();
	d1.display();
	return 0;
}
