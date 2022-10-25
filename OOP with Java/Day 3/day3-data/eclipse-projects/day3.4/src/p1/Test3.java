package p1;

public class Test3 {

	public static void main(String[] args) {
		int[] data=new int[] {1,2,3,45};
		// Using dyn init of array , create printers
		Printer[] printers =new Printer[] { new FilePrinter(), new ConsolePrinter(), new NetworkPrinter() };
		for (Printer printer : printers)// p=printers[0]
		{
			if (printer instanceof FilePrinter)
				((FilePrinter) printer).openFile();
			printer.print("mesg 12345");
			if (printer instanceof FilePrinter)
				((FilePrinter) printer).closeFile();
		}
		

	}

}
