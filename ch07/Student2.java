package ch07;

public class Student2 extends Person2{
	private String sno;
	public Student2(String name, int age, String sno) {
		super(name, age); this.sno = sno;
	}
	
	void print() {
		super.print();
		System.out.println("학번 : " +sno);
	}

}
