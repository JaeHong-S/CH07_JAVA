package ch07;
class D1{
	int k1 = 7;
	D1(){
		System.out.println("할아버지 생성자");
	}
	void m1() {
		System.out.println("할아버지 메서드");
	}
}
class D2 extends D1{
	int k2 = 77;
	D2(){
		System.out.println("아부지 생성자");
	}
	void m2() {
		System.out.println("아부지 메서드");
	}
}
class D3 extends D2{
	int k3 = 777;
	D3(){
		System.out.println("손자 생성자");
	}
	void m3() {
		System.out.println("손자 메서드");
	}
}
public class Inher4 {
	public static void main(String[] args) {
		D3 d1 = new D3();
		d1.m1(); d1.m2(); d1.m3();
		System.out.println("할아부지 변수 : " + d1.k1);
		System.out.println("아부지 변수 : " + d1.k2);
		System.out.println("손자 변수 : " + d1.k3);
		
		
	}
	
	

}
