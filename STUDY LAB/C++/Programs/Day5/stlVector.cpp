#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector<int> v ;
    
    v.push_back(11);  
    v.push_back(1);  
    v.push_back(21);  
    v.push_back(6);  
    v.push_back(9);  
    
    vector<int>::iterator it;
    
    for(it = v.begin(); it != v.end(); it++) 
    {
        cout << *it <<" ";   // for printing the vector
    }
    cout<<"size = "<<v.size();
	 sort(v.begin(), v.end());
  
    cout << "Sorted \n";
     for(it = v.begin(); it != v.end(); it++) 
    {
        cout << *it <<" ";   // for printing the vector
    }
    return 0;
}

