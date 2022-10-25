package shapes;

public class Rectangle extends BoundedShape {
	private double length;
	private double breadth;

	public Rectangle(int x, int y, double length, double breadth) {
		super(x, y);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle " + super.toString() + " [length=" + length + ", breadth=" + breadth + "]";
	}

	// area
	public double area() {
		return length * breadth;
	}

	// perimeter
	public double perimeter() {
		return 2 * (length + breadth);
	}

}
