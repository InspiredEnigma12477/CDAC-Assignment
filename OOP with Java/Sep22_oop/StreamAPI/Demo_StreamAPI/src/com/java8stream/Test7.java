package com.java8stream;

import java.util.List;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

import custom_exceptions.ProductNotFoundException;
import utils.ShopUtils;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
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
					.filter(p -> p.getProductCategory() == cate).mapToDouble(p -> p.getPrice()).average()// avg
					.orElseThrow(() -> new ProductNotFoundException("No Product Under This Category"));

		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

}
