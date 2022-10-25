import java.util.Scanner;

public class TestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1:Pen(20) 2:Pencil(10) 3:Colors(50) 4:Exit");
		int total=0,c,qty = 0;
		boolean flag=true;
		while(flag)
		{
		System.out.println("Enter Choice");
		 c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("Enter Pen Qty");
			qty = sc.nextInt();
			total=total+qty*20;
			break;
		case 2:
			System.out.println("Enter Pencil Qty");
			qty = sc.nextInt();
			total+=qty*10;
			break;
		case 3:
			System.out.println("Enter Color  Qty");
			qty = sc.nextInt();
			total+=qty*50;
			break;
		case 4:
			   //calculate amount  
			flag=false;
			System.out.println("Totaal Amount="+total);
			break;
		default:
			System.out.println("Invalid");
			break;
		}
		
		}//while
		System.out.println("------Thank You-------");

	}

}
