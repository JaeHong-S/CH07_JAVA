package ch07;
class H1{
	int x;
	H1(int x){
		this.x = x;
		System.out.println("부모 매개변수 1개");
	}
	H1(int x, int y){
		this(x);
		System.out.println("부모 매개변수 2개");
	}
	void print() {
		System.out.println("x = " + x);
	}
}
class H2 extends H1{
	H2(int x, int y){
		super(x, y);
		System.out.println("자식 매개변수 2개");
		
	}
	H2(int x, int y, int z){
		this(x, y);
		System.out.println("자식 매개변수 3개");
	}
}

public class Super4Ex {
	public static void main(String[] args) {
		H2 h = new H2(34, 66, 55);
		h.print();
	}

}
