package OOPS.Day2;

public abstract class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean fresh=true;
	
	public Fruit(String color, double weight, String name) 
	{
		//super();
		this.color = color;
		this.weight = weight;
		this.name = name;
	}
	
	public String toString() 
	{
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + "]";
	}
	
	public abstract String taste();
	
	public String getColor() 
	{
		return color;
	}

	public double getWeight()
	{
		return weight;
	}

	public String getName()
	{
		return name;
	}

	public boolean isFresh() 
	{
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public void setStale()
	{
		this.fresh=false;
	}
		
	

	
	
}
