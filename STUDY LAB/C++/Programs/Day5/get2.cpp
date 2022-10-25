// Display a file using get().
#include <iostream>
#include <fstream>
using namespace std;

int main()

{
  char ch;

  ifstream in("my_file.txt", ios::in | ios::binary);
  if(!in) {
     cout << "Cannot open file.\n";
     return 1;
  }

   while(!in.eof()) { 
      in.get(ch);
   //   if(in)    // in will be false when eof is reached
	 cout << ch;
	 cout<<"\n position of get ptr. = "<<in.tellg()<<endl;
   }
     
//  while(in.get(ch))
//  cout << ch;

  in.close();

  return 0;
}

