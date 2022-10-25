package tester;

import shapes.BoundedShape;
import shapes.Circle;
import shapes.Rectangle;

public class TestBoundedShapes {

	public static void main(String[] args) {
		// Using dyn iunit of array , in a single java stmt : create 3 objects : array ,
		// circle , rec
		BoundedShape[] shapes = { new Circle(10, 20, 12.5), new Rectangle(30, 60, 15.6, 40.5) };
		//using for-each loop , display info , arep n peri
		for(BoundedShape s : shapes)
		{
			System.out.println(s);
			if(s instanceof Circle)
			System.out.println("Area "+((Circle)s).area()+" Peri "+((Circle)s).perimeter());
			else
				System.out.println("Area "+((Rectangle)s).area()+"Peri "+((Rectangle)s).perimeter());
		}

	}

}
