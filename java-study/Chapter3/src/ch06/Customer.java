package ch06;

public class Customer {
	// 고객의 속성: 고객아이디, 고객이름, 고객등급, 보너스포인트, 보너스포인트 적립비율
	protected int customerID; // 외부 클래스에서 private를 접근할 수 없으므로
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	/*
	 public Customer() // 생성자: 초기화
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	*/
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 "+ customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	
}
