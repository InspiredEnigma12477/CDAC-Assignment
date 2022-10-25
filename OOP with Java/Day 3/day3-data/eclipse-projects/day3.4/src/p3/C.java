package p3;

public class C implements A, B {
	@Override
	public void show() {
		System.out.println("in show ");
	}

	@Override
	public void show(String mesg) {
		System.out.println("in mesg's show ...."+mesg);
		
	}
	
	
	
}
