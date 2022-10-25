#include<stdio.h>
#include<stdlib.h>


/*enum Menu{EXIT,ADD,SUB,MUL,DIV};

//0.EXIT 1.ADD 2.SUB 3.MUL 4.DIV
int main(void)
{
    int num1,num2;
    enum Menu choice; //Struct student s;
    printf("\n Enter First number");
    scanf("%d",&num1);
    
    printf("\n Enter Second number");
    scanf("%d",&num2);

    do
    {
        printf("\n Enter Choice 0.EXIT 1.ADD 2.SUB 3.MUL 4.DIV");
        scanf("%d",&choice);

        switch(choice)
        {
            case ADD:
                printf("\n Addition = %d \n",num1+num2);
            break;

            case SUB:
                printf("\n Subtraction = %d \n",num1-num2);
            break;

            case MUL:
                printf("\n Multiplication = %d \n",num1*num2);
            break;

            case DIV:
                printf("\n Division = %d \n",num1/num2);
            break;

        }

    } while (choice!=EXIT);
    




    
}*/





/*
typedef enum{MON,TUE,WED,THUR,FRI}DAYS; //nick name given to anonymous enum
int main(void)
{

    printf("\n Mon =%d \n",MON);//allowed

    DAYS d;//d is a variable of type enum having nick name DAYS
    d=TUE;
 
   
    printf("\n Days d  = %d",d);

    return 0;
}
*/


/*enum{MON,TUE,WED,THUR,FRI}; //anonymous enum
int main(void)
{
    printf("\n Mon =%d \n",MON);
    return 0;
}*/





/*typedef enum department{TCT=-1,ADMIN,SECURITY,PLACEMENT} DEPT;
//department is real name of enum
//DEPT is nick name given to enum
int main(void)
{
    enum department dpt_real;//dpt_real is a variable name created by using real name
    DEPT dpt_nick_name;
    //dpt_nick_name is a variable name of type enum DEPT 
    //by using its nick name

    dpt_real=ADMIN;
    printf("\n dpt_real= %d ",dpt_real);
    dpt_nick_name=TCT;
    printf("\n dpt_nick_name= %d \n",dpt_nick_name);

    return 0;
}*/




enum colors{RED,GREEN,BLUE,GREY,PINK};
int main(void)
{
    enum colors clr=(RED,GREEN,BLUE);//int n=(10,20,30);
    printf("\n clr = %d",clr);
    printf("\n sizeof clr = %d \n",sizeof(clr));
    printf("\n Sizeof Enum = %d \n",sizeof(enum colors));
    return 0;
}




/*enum colors{RED=-1,GREEN,BLUE};
int main(void)
{
    printf("RED = %d ",RED);
    printf("\n Green  = %d ",GREEN);
    printf("\n Blue  = %d \n",BLUE);


    printf("\n Sizeof Enum = %d \n",sizeof(enum colors));
    return 0;
}*/



/*
enum colors{RED=5,GREEN=10,BLUE};
int main(void)
{
    enum colors clr; //clr is called as enum variable of type enum colors

    clr=RED; // RED element of enum is accessed through enum variable
    printf("\n value of clr = %d",clr);

    clr=GREEN;
    printf("\n value of clr = %d",clr);

    clr=BLUE;
    printf("\n value of clr = %d \n",clr);

    return 0;
}
*/

/*
enum colors{RED=5,GREEN=10,BLUE};
//enum is keyword
//colors is enum name 
//RED , GREEN ,BLUE these are called as enum elements(int)

int main(void)
{
    printf("Red : %d",RED);//ACCESSING ENUM ELEMENT RED
    printf("\n Green : %d",GREEN);//ACCESSING ENUM ELEMENT GREEN
    printf("\n Blue : %d \n",BLUE);//ACCESSING ENUM ELEMENT BLUE
    return 0;
}

*/


/*
enum colors{RED,GREEN,BLUE=10};
//enum is keyword
//colors is enum name 
//RED , GREEN ,BLUE these are called as enum elements(int)

int main(void)
{
    printf("Red : %d",RED);//ACCESSING ENUM ELEMENT RED
    printf("\n Green : %d",GREEN);//ACCESSING ENUM ELEMENT GREEN
    printf("\n Blue : %d \n",BLUE);//ACCESSING ENUM ELEMENT BLUE
    return 0;
}
*/


/*
enum colors{RED=5,GREEN=6,BLUE=7};
//enum is keyword
//colors is enum name 
//RED , GREEN ,BLUE these are called as enum elements(int)

int main(void)
{
    printf("Red : %d",RED);//ACCESSING ENUM ELEMENT RED
    printf("\n Enum : %d",GREEN);//ACCESSING ENUM ELEMENT GREEN
    printf("\n Blue : %d \n",BLUE);//ACCESSING ENUM ELEMENT BLUE
    return 0;
}
*/



/*
enum colors{RED,GREEN,BLUE};
//enum is keyword
//colors is enum name 
//RED , GREEN ,BLUE these are called as enum elements(int)

int main(void)
{
    printf("Red : %d",RED);//ACCESSING ENUM ELEMENT RED
    printf("\n Enum : %d",GREEN);//ACCESSING ENUM ELEMENT GREEN
    printf("\n Blue : %d \n",BLUE);//ACCESSING ENUM ELEMENT BLUE
    return 0;
}

*/
