#include <fstream>
#include<iostream>
using namespace std;
int main ()
{
fstream fout("my_file.txt",ios::app);
   	
   	cout<<"\n position of put ptr. = "<<fout.tellp(); 
   	
   	
   	fout.seekp(-3, ios::end);
   	
   	fout<<" Hi";
   	
   	 fout.close();
   	 
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
}
