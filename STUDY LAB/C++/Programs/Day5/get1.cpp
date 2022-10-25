#include <fstream>
#include<iostream>
using namespace std;
int main ()
{
    ifstream myfile("my_file.txt");
    cout<<"\n position of get ptr. = "<<myfile.tellg()<<endl;
    
    if (myfile.is_open()) {
        char mychar;
        while (myfile.good()    ) {
            mychar = myfile.get();
             cout << mychar;
        }
   	   
    }
    myfile.close();
	    return 0;
}

