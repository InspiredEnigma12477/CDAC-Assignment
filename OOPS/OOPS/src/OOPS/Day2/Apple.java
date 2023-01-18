package OOPS.Day2;

public class Apple extends Fruit {

	public Apple(String color, double weight, String name)
	{
		super(color, weight, name);
		
	}

	public void jam() 
	{
		System.out.println("Name :"+this.getName()+" weight :"+this.getWeight());
		System.out.println("making jam!");
	}
	
	@Override
	public String toString() {
		return "Fruit [color=" + this.getColor() + ", weight=" + this.getWeight() + ", name=" + this.getName() + "]";
	}
	
	@Override
	public String taste()
	{
		return   "Sweet n sour" ;
	}
	
}
