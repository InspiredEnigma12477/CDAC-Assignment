package tester;

import shapes.BoundedShape;
import shapes.Circle;
import shapes.Rectangle;

public class TestBoundedShapes {

	public static void main(String[] args) {
		// Using dyn iunit of array , in a single java stmt : create 3 objects : array ,
		// circle , rec
	//	BoundedShape s=new BoundedShape(10,20); javac err for R.H.S
		BoundedShape[] shapes = { new Circle(10, 20, 12.5), new Rectangle(30, 60, 15.6, 40.5) };
		//using for-each loop , display info , arep n peri
		for(BoundedShape s : shapes)
		{
			System.out.println(s);//toString : Circle , Rect : D MD
			
			System.out.println("Area "+s.area()+" Perimeter "+s.perimeter());
			//if it's a circle : draw the arc : 15 deg
			if(s instanceof Circle)
				((Circle)s).drawArc(15);
		
		}

	}

}
