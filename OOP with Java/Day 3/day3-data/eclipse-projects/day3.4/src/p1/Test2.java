package p1;

public class Test2 {

	public static void main(String[] args) {
		// indirect referencing
		Printer p;// i/f type of ref var. , will be mem allocated in n stack(stack frm of main()
					// method) , 4/8/16bytes will be allocated as per JVM's specs.
	//	p=new Printer();
		//Can i/f ref ---> DIRECTLY(w/o type casting) refer to ANY concrete impl  class instance ? YESS

		p=new ConsolePrinter();//is it eg of direct referencing or indirect ref ? : indirect ! : up casting 
		p.print("new mesg!!!");//run time poly(=DMD) achieved via i/f ref.
		p=new NetworkPrinter();//is it eg of direct referencing or indirect ref ? : indirect ! : up casting 
		p.print("new mesg!!!");//run time poly(=DMD) achieved via i/f ref.
		
	
		
		
	}

}
