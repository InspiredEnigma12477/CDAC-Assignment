package com.code;

public class Student {
private int rollno;//instance var
private String name;//instance var
private  static String collageName;//instance

//initialize static data members
static
{
	
	System.out.println("----static block 1 get invoked as soon as class get loaded-----");
	collageName="IACSD";
}
static
{
	
	System.out.println("----static block 2 get invoked as soon as class get loaded-----");
	//collageName="IACSD";
}
static
{
	
	System.out.println("----static block  3 get invoked as soon as class get loaded-----");
	//collageName="IACSD";
}
public Student(int rollno,String name)
{//for initilaization of instance variable(data members) use constructor
	System.out.println("-----constr---");
	this.rollno=rollno;
	this.name=name;
	
	
}
public void display() {
	System.out.println(rollno +"   "+name+"   "+collageName);
}
public static void showCollageName()
{
	//static methods can access only static data membrs and methods
	//static methods can not access non static data members and methods
	
	System.out.println("Collage Name:"+collageName);
	
}
public static void changeName(String str)
{
	collageName=str;
	int a=10;

}
}












