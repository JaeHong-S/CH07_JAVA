package ch07;
class E1 {
	E1(){System.out.println("부모클래스 기본생성자");}//기본 생성자가 있으면 E2 클래스를 만들때 생성자를 따로 생성하지 않아도 컴파일시 기본생성자 만들어져서 오케이
	E1(int k) {// 하나라도 생성자가 있으면 default 생성자가 생성되지 않는다.
		System.out.println("난 매개변수가 하나인 생성자 : " + k);
	}
	void m1() {
		System.out.println("대박 사건");
	}
}
class E2 extends E1{
	E2(){}
	E2(int k) {
		super(7);// 이게 없다면, E2의 객체를 생성할 때 부모클스의 기본 생성자를 호출 근데 만약 부모 클래스에 기본 생성자가 없다면 부모클래스의 생성자 매개변수에 맞춰super에도 매개변수를 넣어줘야됨
	}
	void m2() {
		System.out.println("쪽박일 걸");
	}
	
}
public class Super1 {
	public static void main(String[] args) {
		E2 E = new E2(); // E2 클래스에도 기본생성자가 있어야함
		E2 e = new E2(7);
		e.m1(); e.m2();
		
	}
}
