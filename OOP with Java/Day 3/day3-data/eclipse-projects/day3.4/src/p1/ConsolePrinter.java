package p1;

public  class ConsolePrinter implements Printer{
	private int DATA;
	//Can the imple class access i/f constants DIRECTLY (i.e w/o i/f name) ? YES
	@Override
	public void print(String mesg)
	{
		System.out.println("Printing a mesg : "+mesg+" using Console Printer");
		System.out.println("accessing i/f const directly "+DATA+" "+Printer.DATA);
	}

}
