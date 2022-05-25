package ch06;

import java.util.ArrayList;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerJ = new Customer(10010, "James");
		Customer customerK = new GoldCustomer(10010, "Kim");
		Customer customerN = new GoldCustomer(10010, "Nami");
		Customer customerP = new VIPCustomer(10010, "Percy");
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerK);
		customerList.add(customerN);
		customerList.add(customerP);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "�Դϴ�.");
		}
	}

}
