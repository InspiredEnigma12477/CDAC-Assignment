#include <iostream>
#include <fstream>
using namespace std;
int main() {
   fstream fout("my_file.txt", ios::out);
   if (!fout) {
       cout << "No such file";
   }
   else {\0
    	cout << "\n file opened";
    	
    	fout<<"Hello";
    	fout.close();
   }

	return 0;
}
