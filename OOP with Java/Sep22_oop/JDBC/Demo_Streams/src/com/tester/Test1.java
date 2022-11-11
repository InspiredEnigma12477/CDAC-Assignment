package com.tester;

import java.util.function.Predicate;
interface MyFun<T>
{
	boolean  test2(T i);
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate< Integer> pre=(i)->i>10;
		
		
		System.out.println(pre.test(3));
		MyFun<Integer> fi=(x)->  x>50; ;
		System.out.println(fi.test2(56));
		
		
	}

}
