package com.dzianis.patterns.GRASP.InformationExpert;

/**
 * Шаблон информационный эксперт (Information Expert)- GRASP 
 * 
 * Проблема 
 * В системе должна аккумулироваться, рассчитываться и т. п. необходимая информация. 
 * 
 * Решение  
 * Назначить обязанность аккумуляции информации, расчета и т. п. некоему классу (информационному эксперту), 
 * обладающему необходимой информацией. (Информация должна обрабатываться там где она есть!)
 * 
 * Рекомендации  
 * Информационным экспертом может быть не один класс, а несколько.
 *
 */
public class Demo {

	public static void main(String[] args) {
		
		incorrect();

		correct();
	}

	
	private static void incorrect(){
		Order order = prepareOrder();
		
		int price = 0;
		for(Item item: order.items){
			price = price +item.price;
			
			// getDiscountPrice...
		}
		
		System.out.println(price);
	}
	
	private static void correct(){
		Order order = prepareOrder();
		
		System.out.println(order.getPrice());
	}
	
	private static Order prepareOrder(){
		Order order = new Order();
		
		order.items.add(new Item(5));
		order.items.add(new Item(5));
		order.items.add(new Item(5));
		
		return order;
	}
}
