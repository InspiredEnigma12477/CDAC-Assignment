#include<iostream>
#include<string.h>
using namespace std;
class Student{
	int roll;
	string name;
	public:
		static int count;
		static string course;
		Student(){
			roll=9;
			name="Ajay";
		}
		Student(int r,string nm)
		{
			count++;
			roll=r;
			name=nm;
		//	strcpy(name,nm);	
		}
		void disp();
};
int Student::count =0;
string Student::course="PGDAC";

void Student::disp(){
	cout<<"\n Roll ="<<roll;
	cout<<"\n Name ="<<name;
	cout<<"\n Course ="<<course;
}
int main(){
	
//	Student s(2,"Riya");
	
//	//strcpy(Student::course,"PGDAC");
//	s.disp();
//	Student::course="PGDBDA";
//	s.disp();
//	Student s1(3,"Ajay");
//	s1.disp();
	
	Student s[3];  //implicit call to default constructor
	string n;
	int r;
	for(int i=0;i<3;i++){
		
		cout<<"\nEnter Roll number & name for a student :  ";
		cin>>r>>n;
		s[i]=Student(r,n);    //Explicit call to parameterized constructor
	}
	
	for(int i=0;i<3;i++){
		cout<<"\nStudent "<<i+1;
		s[i].disp();
	}
	
	
	
	cout<<"\n Number of Student created : "<<Student::count;
	return 0;
}
