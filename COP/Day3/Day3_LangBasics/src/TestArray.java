import java.util.Scanner;
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;//local 
		//System.out.println(a);//compile error
		
		int[] arr;//arrays are ref type
		arr=new  int[5];//memory getting allocated on heap for storing 5 int values
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Numbers:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();//
			
			System.out.println("------------------------");
			
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		
		
	}

}
