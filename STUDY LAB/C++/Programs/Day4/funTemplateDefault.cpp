#include<iostream>
using namespace std;

template<class T>
T add(T x,T y,T z=9){
	return x+y+z;
}
int main(){
	
	cout<<"\nAddition of int ="<<add(5,4);

	
	return 0;
}
