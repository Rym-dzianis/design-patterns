package com.dzianis.patterns.GRASP.Creator;


/**
 * ��������� ����������� ������ (Creator) - GRASP 
 * ��������
 * "���" ������ �������� �� �������� ����������� ������. 
 * 
 * ������� 
 * ��������� ������ � ����������� ��������� ������� ������� ������ � 
 * 
 * ������������ 
 * ������� ������������ ������� ���� ����� � ��������, ����������, ������� ���������� � �.�. ������� ������ �.
 * 
 * ����������� ������� (������ ��������������)
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
