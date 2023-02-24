package ch07;

public class Bus extends Car {
	public Bus(String kind, int person) {
		setKind(kind); setPerson(person);
	}
	void printBus() {
		print();
		System.out.println("승객 40명 이상을 태울 수 있다");
	}

}
