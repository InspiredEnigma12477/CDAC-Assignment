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
//   	fstream fout("my_file.txt",ios::out);
//   	
//   	cout<<"\n position of put ptr. = "<<fout.tellp(); 
//   	
//   //	fout.seekp(0,ios::end);
//   	
//   	fout<<"Evening";
//   	
//   	 fout.close();
    
    ifstream fin("my_file.txt");
    cout<<"\n position of get ptr. = "<<fin.tellg()<<endl;
    
    if (fin.is_open()) {
        char mychar;
        fin.seekg(6);
        while (fin.good()    ) {
            mychar = fin.get();
             cout << mychar;
        }
    }
	    return 0;
}

