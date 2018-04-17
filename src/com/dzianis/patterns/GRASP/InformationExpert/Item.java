package com.dzianis.patterns.GRASP.InformationExpert;

public class Item {
	final int price;

	public Item(int price) {
		this.price = price;
	}
	
	public int getDiscountPrice(){
		return (int) (price * 0.7);
	}
}
