package com.dzianis.patterns.GRASP.Creator;


/**
 * Создатель экземпляров класса (Creator) - GRASP 
 * Проблема
 * "Кто" должен отвечать за создание экземпляров класса. 
 * 
 * Решение 
 * Назначить классу В обязанность создавать объекты другого класса А 
 * 
 * Рекомендации 
 * Логично использовать паттерн если класс В содержит, агрегирует, активно использует и т.п. объекты класса А.
 * 
 * Абстрактная фабрика (шаблон проектирования)
 * 
 */
public class Demo {

public static void main(String[] args) {
		
		incorrect();

		correct();
	}

	
	private static void incorrect(){
		Order order = new Order();
		
		order.items.add(new Item(5));
		order.items.add(new Item(5));
		order.items.add(new Item(5));
	}
	
	private static void correct(){
		Order order = new Order();
		
		order.addOrder(5);
		order.addOrder(5);
		order.addOrder(5);
	}
}
