package p1;

public  class FilePrinter implements Printer{
	
	@Override
	public void print(String mesg)
	{
		System.out.println("Storing a  mesg : "+mesg+" in a text file");
		
	}
	//Can imple class add a new func ? YES
	
	public void openFile()
	{
		System.out.println("opening a file !");
	}
	public void closeFile() {
		System.out.println("closing  a file !");
	}

}
