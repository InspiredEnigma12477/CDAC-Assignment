#include<iostream>
using namespace std;

template<class T1, class T2>
T1 add(T1 x,T2 y){
	return x+y;
}
int main(){
	
	cout<<"\nAddition of int ="<<add(5.2,4);

	
	return 0;
}
