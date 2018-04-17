package com.dzianis.patterns.GRASP.InformationExpert;

import java.util.ArrayList;
import java.util.List;

public class Order {

	List<Item> items = new ArrayList<>();
	
	public int getPrice(){
		int price = 0;
		for(Item item: items){
			price = price + item.price;
		}
		
		return price;
	}
	
	public int getDiscountPrice(){
		// something
		return 0;
	}
}
