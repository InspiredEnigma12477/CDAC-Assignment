
public class TestBreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("----break-------");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				break;
			System.out.println(i);
			
		}
		System.out.println("----continue-------");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				continue;
			System.out.println(i);
			
		}
		
	}
	

}
