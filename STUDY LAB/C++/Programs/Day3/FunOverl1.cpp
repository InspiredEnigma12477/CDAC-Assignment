#include<iostream>
using namespace std;
float show(float);
double show(double);
//char show(char);

int main(){
	cout << "\nAddition of int  :"<<show(3555);
	//char c='A';
	cout << "\nAddition of float  :"<<show('C');
	return 0;
}
float show(float i1){
	return i1;
}
char show(char f1){
	cout<<"\n char function";
	return f1;
}
