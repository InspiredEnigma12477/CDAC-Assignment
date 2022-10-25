#include <stdio.h>
 
int main()
{
     
    int n1 = 5, n2 = 10, n3 = 15, max;
     
    // Largest among n1, n2 and n3
    max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
      printf("Largest number among %d, %d and %d is %d.",
                                         n1, n2, n3, max);
 /*if(n1>n2)
 {
 	if(n1>n3)
 	{
 	n1
 	else
 	n2
 }
 else
 {
 if(n2>n3)
}

 }
    return 0;
}
