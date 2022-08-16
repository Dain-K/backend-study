package ch18;

public class Company {
	
	private static Company instance = new Company();
	private Company() {
		
	} // �ܺο��� Company�� ������� �� �� ������ ������ ����
	
	public static Company getInstance() { // �ܺο��� Ŭ���� �̸����� ȣ���� �� �ֵ���
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
