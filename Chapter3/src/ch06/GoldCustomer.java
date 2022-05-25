package ch06;

public class GoldCustomer extends Customer {

	double salseRatio;
	
	public GoldCustomer(int customerID, String customerName) { // 持失切 持失
		super(customerID, customerName);
		
		salseRatio = 0.1;
		bonusRatio = 0.02;
		customerGrade= "GOLD";
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salseRatio);
	}
	
}
