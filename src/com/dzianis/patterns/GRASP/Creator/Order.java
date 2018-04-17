package com.dzianis.patterns.GRASP.Creator;

import java.util.ArrayList;
import java.util.List;

public class Order {

	List<Item> items = new ArrayList<>();
	
	public void addOrder(int price){
		items.add(new Item(price));
	}
}
