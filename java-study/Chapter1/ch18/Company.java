package ch18;

public class Company {
	
	private static Company instance = new Company();
	private Company() {
		
	} // 외부에서 Company를 마음대로 할 수 없도록 생성자 생성
	
	public static Company getInstance() { // 외부에서 클래스 이름으로 호출할 수 있도록
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
