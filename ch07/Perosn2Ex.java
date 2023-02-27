package ch07;

public class Perosn2Ex {
	public static void main(String[] args) {
		Person2[] person = new Person2[6];
		person[0] = new Student2("로제",26, "970312");
		person[1] = new Student2("보검",29, "940922");
		person[2] = new Teacher2("제니",27, "JAVA");
		person[3] = new Teacher2("은우",32, "DATABASE");
		person[4] = new Manager2("효리",38, "화장실청소");
		person[5] = new Manager2("화사",26, "운전");
		
		for(Person2 p : person) {
			p.print();
		}
	}

}
