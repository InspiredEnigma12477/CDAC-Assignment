package com.java8stream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

import utils.ShopUtils;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//// exception handling without orElseThrow with out custom exception
		try
		{
		List<Product> allPrds = ShopUtils.populateProductList();

		System.out.println("Orignal List");
		allPrds.forEach(i -> System.out.println(i));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Category:");
		Category cate = Category.valueOf(sc.next().toUpperCase());

		System.out.println("show products by category");

		allPrds.stream()// stream
				.filter(p -> p.getProductCategory() == cate).forEach(i -> System.out.println(i));

		System.out.println("Avg:");
		double avg = allPrds.stream()// stream
				.filter(p -> p.getProductCategory() == cate).
				mapToDouble(p -> p.getPrice()).
				average().orElseThrow();

		}
		catch(Exception ex)
		{
			System.err.println(ex.getMessage());
		}
		 
	}

}
