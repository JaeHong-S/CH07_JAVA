package ch07;

public class Car {
	private String kind;
	private int person;
	
	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setPerson(int person) {
		this.person = person;
	}
	
	void print() {
		System.out.println("==========");
		System.out.println("차 종류 : " + kind);
		System.out.println("승차 인원 : " + person);
		
	}

	
	

}
