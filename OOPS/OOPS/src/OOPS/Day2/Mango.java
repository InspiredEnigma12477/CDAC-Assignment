package OOPS.Day2;

public class Mango extends Fruit {

	public Mango(String color, double weight, String name)
	{
		super(color, weight, name);
		
	}
	
	public void pulp()
	{
		System.out.println("Name :"+this.getName()+" color :"+this.getColor());
		System.out.println("Creating pulp!!!");
	}

	@Override
	public String toString() {
		return "Fruit [color=" + this.getColor() + ", weight=" + this.getWeight() + ", name=" + this.getName() + "]";
	}
	
	@Override
	public String taste()
	{
		return  "Sweet" ;
	}
	
	
	
}
