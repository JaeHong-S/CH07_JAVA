package ch07;
class B1 {
	int k1 = 77;
	void m1() {
		System.out.println("난 B1 메서드");
	}
}
class B2 extends B1{
	int k2 =88; 
	void m2() {
		System.out.println("난 B2 메서드");
	}
}
class B3 extends B2{
	int k3 = 99;
	void m3() {
		System.out.println("난 B3 메서드");
	}
}

public class Inher2 {
	public static void main(String[] args) {
		B3 b3 = new B3();
		System.out.println("B1 변수 : " + b3.k1);
		System.out.println("B2 변수 : " + b3.k2);
		System.out.println("B3 변수 : " + b3.k3);
		b3.m1();
		b3.m2();
		b3.m3();
		
	}
	
	

}
