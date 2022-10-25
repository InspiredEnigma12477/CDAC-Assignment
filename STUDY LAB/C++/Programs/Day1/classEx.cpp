
#include<string.h>
using namespace std;
class stud{
	
	int r;
	char nm[10];
	int marks[5];
	public:
	void setDetail(){
		r=4;
		strcpy(nm,"Ajay");
	}
	void getDetail(){
		cout<<"\n Roll  ="<<r;
		cout<<"\n Name  ="<<nm;
	}
	void calAvg();
};
int main(){
	stud s;
	s.setDetail();
	s.getDetail();
	return 0;
}
