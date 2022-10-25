package shapes;
//how to import static member/s of the specific class : import static syntax
import static java.lang.Math.PI;

public class Circle extends BoundedShape {
	private double radius;

	public Circle(int x, int y, double radius) {
		super(x,y);
		this.radius=radius;
	}
	//override toString
	@Override
	public String toString()
	{
		return "Circle "+super.toString()+" radius="+radius;
	}
	//area
	public double area()
	{
		return PI*radius*radius;
	}//peri
	public double perimeter()
	{
		return 2*PI*radius;
	}
}









