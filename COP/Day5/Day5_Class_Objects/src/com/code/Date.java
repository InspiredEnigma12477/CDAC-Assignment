package com.code;

public class Date {
private int day,month,year;


public Date()
{ // this(2022);//
	System.out.println("default date");
	day=1;month=6;year=1990;
}

public Date(int year)
{
	
this();//default constr   constr chaining
	System.out.println("parameter(year) date");
	this.year=year;
	//instance variable=local variable
	//this();//not allowed
}

public void printDate() {
	System.out.println(day+"/"+month+"/"+year);
}


















}
