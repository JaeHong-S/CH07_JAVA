package ch07;

public class FireEngine extends Car{
	public FireEngine(String kind, int person) {
		setKind(kind); setPerson(person);
	}
		
	void printFe() {
		print();
		System.out.println("불끄는차야");
	}

}
