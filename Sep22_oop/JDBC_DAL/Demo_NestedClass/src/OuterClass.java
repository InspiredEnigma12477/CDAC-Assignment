
public class OuterClass {

	//members
	private int abc=100;
	
	
	//class as member 
	public class InnerClass
	{

		public void disp()
		{
			System.out.println("Abc="+abc);
		}
		
		
	}//inner class end
	
	public void methodForClass()
	{
		int a=10;//local
		//method local class
		class MethodInnerClass{
			
			public void test()
			{
				System.out.println("Inside Method:"+a);
			}
		}
		MethodInnerClass m=new MethodInnerClass();
		m.test();
		
	}


public static class StaticInnerClass
{
	public static void test2()
	{
		System.out.println("Method from Static inner Class");
	}
}
}
