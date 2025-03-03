package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Product {

	public Product(String color, String productName, int price) {
		this.color=color;
		this.productName=productName;
		this.price=price;
	}
	
	private String color;
	private String productName;
	private int price;
	
	
}
