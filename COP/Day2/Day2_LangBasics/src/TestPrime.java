import java.util.Scanner;
public class TestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No1:");
		int no=sc.nextInt();
		System.out.println("Number="+no);
		boolean flag=false;
		for(int i=2;i<no/2;i++)//no=8
		{
			if(no%i==0)
				{//System.out.println("Not Prime");
				flag=false;
				break;
				}
			else
			{flag=true;
				//System.out.println("Prime");
			}
		}
		if(flag==true)
		{
			System.out.println("Prime");
		}
		else
			System.out.println(" Not Prime");

	}

}
