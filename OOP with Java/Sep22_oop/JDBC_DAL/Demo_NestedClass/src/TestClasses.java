
public class TestClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//access InnerClass
		OuterClass outer=new OuterClass();
		OuterClass.InnerClass obj=outer.new InnerClass();
		obj.disp();
		
		outer.methodForClass();
		
		
		OuterClass.StaticInnerClass.test2();
		
	}

}
