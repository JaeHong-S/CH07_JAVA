package ch07;

public class OuterEx {
//	Gui Graphic User Interface에서 사용, 하지만 요즘은 잘 안 쓰임
	public static void main(String[] args) {
		Outer out = new Outer(100,200);
		Outer.Inner inner1 = out.new Inner();
		Outer.Inner inner2 = out.gerInner();
		
		System.out.println(inner1.capcity());
		System.out.println(inner2.capcity());
	}

}
