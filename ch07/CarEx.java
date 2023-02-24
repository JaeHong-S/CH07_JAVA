package ch07;

public class CarEx {
	public static void main(String[] args) {
		Ambulance a = new Ambulance("구급차", 3);
		Bus b = new Bus("관광버스", 41);
		FireEngine f = new FireEngine("소방차", 6);
		
		
		a.printAm();
	
		b.printBus();
		
		f.printFe();
	}

}
