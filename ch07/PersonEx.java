package ch07;

public class PersonEx {
	public static void main(String[] args) {
		Student st1 = new Student("로제", 26, "5678");
		Student st2 = new Student("제로", 62, "8765");
		Teacher th1 = new Teacher("김선생", 77, "JAVA");
		Teacher th2 = new Teacher("생선김", 99, "리액트");
		Manager mg1 = new Manager("신노스케", 44, "경비실");
		Manager mg2 = new Manager("사스케", 46, "앞마당");
		
		st1.printSt(); st2.printSt();
		th1.printTh(); th2.printTh();
		mg1.printMg(); mg2.printMg();
		
	}

}
