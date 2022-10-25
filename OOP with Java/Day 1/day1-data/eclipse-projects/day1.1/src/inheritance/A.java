package inheritance;

public class A {
	A() {
		super();
		System.out.println("In A's ctor");
	}
}
class B extends A {
	B() {
		super();
		System.out.println("In B's ctor");
	}
}
class C extends B{
	C() {
		super();
		System.out.println("In C's ctor");
	}
}
