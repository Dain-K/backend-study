package ch04;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price);
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + price);
		
		Customer vc = new VIPCustomer(12345, "noname"); // 실제 메서드가 호출이 된다.
		// vc 변수의 타입은 Customer지만 인스턴스의 타입은 VIPCustomer이다
		// 자바의 모든 메서드는 가상 메서드 임
		System.out.println(vc.calcPrice(1000));

	}

}
