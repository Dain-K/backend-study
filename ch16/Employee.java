package ch16;

public class Employee {
	
	private static int serialNum = 1000; // 스택 메모리가 참여 할 수 있는 변수는 공유 메모리 안에 있다
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		
		serialNum++;
		employeeId = serialNum; //멤버 변수에 따로 부여하여 동일한 번호를 갖지 않도록 한다
	}
	
	public static int getSerialNum() { // 외부에서 변경을 하지 못하도록 하기 위해 set 함수는 제공하지 않음
		// int i = 0;  // 지역변수는 함수 내부에서 쓰는 것이므로 상관없다
		// employeeName = "Lee"; 스테틱 안에서는 일반 변수를 사용할 수 없다.
		
		return serialNum;
	}
	
	public int getEmployeeId() {
		// serialNum = 1000; 일반 함수에서 static 변수를 사용하는 것은 가능
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId; 
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}