package OOPS.Day2;

public class Orange extends Fruit {

	public Orange(String color, double weight, String name)
	{
		super(color, weight, name);
	}
	
	public void juice() 
	{
		System.out.println("Name :"+this.getName()+" weight :"+this.getWeight());
		System.out.println("Extracting juice");
	}
	
	@Override
	public String toString() {
		return "Fruit [color=" + this.getColor() + ", weight=" + this.getWeight() + ", name=" + this.getName() + "]";
	}
	
	@Override
	public String taste()
	{
		return   "sour" ;
	}
	
	
}
