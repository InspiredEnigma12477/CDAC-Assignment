package tester;
import iacsd.Student;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a;//local variable
		a=10;
		//System.out.println(a);//erorr for local variable :un initialised
		
		
		//create an object of Student class
		Student stud;//non primitive:ref type holds ref
		stud=new Student();//imp
		
		System.out.println(stud.hashCode());
		
		stud.display();
		//
		
		Student std2=new Student();//
		System.out.println(std2.hashCode());
		std2.acceptInformation(101, "Ram",90);//methods need to call explicitly
		std2.display();//
		
		System.out.println("------------------------");
		
		Student std3=new Student();
		std3.display();
		std3.acceptInformation(102, "Sumit", 40);
		std3.display();
		
		Student std4=std3;
		std4.display();//
		
		System.out.println(std3.hashCode()+"    "+std4.hashCode());
		
	}
	//out side main local not accessible

}
