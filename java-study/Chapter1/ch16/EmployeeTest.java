package ch16;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee employeeLee = new Employee(); // 지역 변수는 스택 메모리 안에 생긴다
		employeeLee.setEmployeeName("이순신");
		
		// System.out.println(Employee.serialNum); // static 변수 이므로 클래스 이름으로 참조해야한다
		// 외부에서 참조하면 안되므로 오류가 뜬다
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		// 두개의 메모리가 하나의 메모리를 공유하고 있는 것을 알 수 있다 (공통으로 사용)
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());
	}

}
