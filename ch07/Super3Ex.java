package ch07;

class G1{
	int age = 17;
	G1(String name){
		System.out.println(name + " 가 생성되었습니다.");
	}
	void disp() {
		System.out.println("오늘은 금요일이야!");
	}
}

class G2 extends G1{
	G2(String name){ //super(매개변수, ) 없으면 부모 디폴트 생성자가 호출
		super(name);
		System.out.println(name + "야 반가워");
	}
	int age = 18;
	void disp() {
		System.out.println("공부하기 딱 좋은 요일이구나!");
	}
	void print() {
		super.disp();
		disp();
		System.out.println("부모나이 : " + super.age);
		System.out.println("자식나이 : " + age);
	}
	
}
public class Super3Ex {
	public static void main(String[] args) {
		G2 g = new G2("부모 클래스");
		g.disp();
		g.print();
		
		
	}
	

}
