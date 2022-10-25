#include<stdio.h>
int main()
{
	char ch;
	printf("enter the letter");
	scanf("%c",&ch);
	switch(ch)
	{
		case 'a':
	    case 'e':
	    case 'i':
	    case 'o':
	    case 'u':
	    	printf("Vowel");
	    	break;
	    	default:
	    	printf("consonant");
	    	
	    		
	    	
	}
	return 0;
}
