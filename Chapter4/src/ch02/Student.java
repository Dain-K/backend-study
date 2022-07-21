package ch02;

public class Student implements Cloneable {

	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentNum + "," + studentName;
	}
	
	@Override
	public boolean equals(Object obj) { // 같을때 같은 값을 가지도록
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentNum == std.studentNum)
				return true;
			else return false;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() { // int 가 같을 때 같은 해쉬코드를 반환하도록
		return studentNum;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
