package ch07;

public class Manager2 extends Person2{
	private String part;
	public Manager2(String name, int age, String part) {
		super(name, age); this.part = part;
	}
	
	void print() {
		super.print();
		System.out.println("담당 : " +part);
	}

}
