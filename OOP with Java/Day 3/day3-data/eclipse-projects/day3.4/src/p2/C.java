package p2;

public class C implements A, B {
	@Override
	public void show() {
		System.out.println("in show "+A.DATA+" "+B.DATA);
	}
	
	
}
