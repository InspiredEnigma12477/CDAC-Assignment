#include<iostream>
using namespace std;
int add(int,int);
float add(float,float);
double add(double,double);
void add(char,char);
float add(float,float,float);
int main(){
	cout << "\nAddition of int  :"<<add(3,4);
	cout << "\nAddition of float  :"<<add(2.3f,5.3f);
	return 0;
}
//int add(int i1,int i2){
//	return i1+i2;
//}
float add(float f1,float f2){
	cout<<"\nFloat function";
	return f1+f2;
}
