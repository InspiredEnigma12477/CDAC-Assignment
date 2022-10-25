package com.tester;

public class TestStaticBlock {
static
{
	System.out.println("--static block get invoked as soon as class get loaded");
	System.out.println("---static block get invoked b4 main method------");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---main method invoked------");
		//java  TestStaticBlock
	}

}









