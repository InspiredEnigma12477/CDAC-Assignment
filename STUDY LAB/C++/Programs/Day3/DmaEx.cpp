#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	
	int *ptr=new int[n];
	cout<<"\nEnter 3 values";
	int *p=ptr;
	for(int i=0;i<3;i++){
		cin>>*ptr;
		ptr++;
	}

	for(int i=0;i<3;i++){
		cout<<"\n value at ptr "<<i+1<<" = "<<*p++;
	}

		//	delete []ptr;
	return 0;
}
