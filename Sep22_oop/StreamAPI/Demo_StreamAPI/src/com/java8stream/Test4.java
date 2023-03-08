package com.java8stream;

import java.util.List;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

import utils.ShopUtils;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// get all prds into List
		List<Product> allPrds = ShopUtils.populateProductList();

		System.out.println("Orignal List");
		allPrds.forEach(i -> System.out.println(i));

		// sort prdList
		System.out.println("Sorted prd List");
		allPrds.stream()// stream
				.sorted()// natural sorting by id
				.forEach(i -> System.out.println(i));

		// show products by category
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Category:");
		Category cate = Category.valueOf(sc.next().toUpperCase());

		System.out.println("show products by category");

		allPrds.stream()// stream
				.filter(p -> p.getProductCategory() == cate).forEach(i -> System.out.println(i));

		// cal sum of all fruits

		System.out.println("show products by category  and get total");

		double total = allPrds.stream()// stream
				.filter(p -> p.getProductCategory() == cate)// filtered prd
				.mapToDouble(p -> p.getPrice())// get price from filtered prd
				.sum();// non stream object

		System.out.println("Total=" + total);
		
		
		//Lab:max ,min price of prod by category
		//
		System.out.println("show products by category  and get total");

		double avg = allPrds.stream()// stream
				.filter(p -> p.getProductCategory() == cate)// filtered prd
				.mapToDouble(p -> p.getPrice())// get price from filtered prd
				.average().getAsDouble();//get Double value from Optionaldouble

		System.out.println("Avg=" + avg);
	
		
		
	}

}
