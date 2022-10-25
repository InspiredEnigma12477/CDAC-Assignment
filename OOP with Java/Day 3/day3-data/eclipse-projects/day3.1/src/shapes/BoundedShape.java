package shapes;

public class BoundedShape {
	private int x;
	private int y;
	//ctor
	public BoundedShape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	//toString
	@Override
	public String toString()
	{
		return "x="+x+" y="+y;
	}
	
}
