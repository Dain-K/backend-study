package ch03;

public class VIPCustomer extends Customer {
	
	double salesRatio; // 할인해줌
	String agentID;
	
	/*  public VIPCustomer() {
		
		super(0, "no-name"); // default 생성자 호출, 안적어도 자동으로 호출된다
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call")
	}
	*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) call");
		
	}
	
	public String getAgentID() {
		return agentID;
	}
}
