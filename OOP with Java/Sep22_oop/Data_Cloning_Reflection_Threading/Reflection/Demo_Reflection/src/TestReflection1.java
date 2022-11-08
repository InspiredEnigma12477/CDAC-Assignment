import java.util.ArrayList;

public class TestReflection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Use Class<?>
		
		Employee emp1=new Employee(101, "Abc", "Pune", 90000);
		
		 Class<Employee> eObj= (Class<Employee>) emp1.getClass();
		//
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		System.out.println(eObj.getName());
		System.out.println(eObj.getPackageName());
		
		System.out.println(list.getClass().getName());
		
		Class<Integer> iObj=Integer.class;
		System.out.println(iObj.getName());
		
		
		
		
		
	}

}
