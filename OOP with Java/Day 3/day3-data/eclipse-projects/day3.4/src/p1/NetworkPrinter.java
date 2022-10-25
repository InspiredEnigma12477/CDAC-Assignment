package p1;

public  class NetworkPrinter implements Printer{
	
	@Override
	public void print(String mesg)
	{
		System.out.println("Sending  a mesg : "+mesg+" to server side printer");
		
	}

}
