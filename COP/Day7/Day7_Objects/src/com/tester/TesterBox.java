package com.tester;
import com.code.Box;
public class TesterBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b1=new Box();//default
		b1.display();
		
		Box b2=new Box(10, 15, 17);//parameter constr(,,,)
		b2.display();
		
		Box b3=new Box(40);//parameter (i);
		b3.display();
		
		
		b2=null;
		b2=b1;
		b1.setL(100);
		b1=null;
		b2.display();
		b2.setL(900);
		b2.display();
		
		
	 Box box1=new Box(50, 60, 70);
	 //System.out.println(box1);
	 box1.display();
	 Box box2=new Box(50, 60, 70);
		box2.display();
	//box2=box1;
		System.out.println(box1.hashCode()+"          "+box2.hashCode());
	if(box1==box2)//checking ref values
		System.out.println("same");
	else
		System.out.println("not same");
		
		
		//
		
	boolean result=	box1.isSame(box2);
		if(result)
			System.out.println("same");
		else
			System.out.println("not same");
	
	
		System.out.println(box1.isSame(b3)?"same":"not same");
	
		
		
		
		
		
	
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	}

}
