package ch16;

public class Employee {
	
	private static int serialNum = 1000; // ���� �޸𸮰� ���� �� �� �ִ� ������ ���� �޸� �ȿ� �ִ�
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		
		serialNum++;
		employeeId = serialNum; //��� ������ ���� �ο��Ͽ� ������ ��ȣ�� ���� �ʵ��� �Ѵ�
	}
	
	public static int getSerialNum() { // �ܺο��� ������ ���� ���ϵ��� �ϱ� ���� set �Լ��� �������� ����
		// int i = 0;  // ���������� �Լ� ���ο��� ���� ���̹Ƿ� �������
		// employeeName = "Lee"; ����ƽ �ȿ����� �Ϲ� ������ ����� �� ����.
		
		return serialNum;
	}
	
	public int getEmployeeId() {
		// serialNum = 1000; �Ϲ� �Լ����� static ������ ����ϴ� ���� ����
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