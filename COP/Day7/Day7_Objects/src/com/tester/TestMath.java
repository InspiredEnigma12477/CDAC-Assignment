package com.tester;
import com.code.MyMath;
public class TestMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
;
		int a=10,b=20;
		System.out.println("b4  swap values="+a +"  "+b);//10  20
		MyMath.swap(a, b);
		System.out.println("after swap  values "+ a+   "  "+b);
		//how to swap by ref
		//int[] arr=new int[] {a,b};
		//or
		int[] arr=new int[2];
		System.out.println(arr.hashCode());
		arr[0]=a;
		arr[1]=b;
		MyMath.swapByRef(arr);
		
		System.out.println("outside swap values "+arr[0] +"  "+arr[1]);//20  10

		
		
		
		
	}

}
