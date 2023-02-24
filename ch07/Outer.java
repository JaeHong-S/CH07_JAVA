package ch07;

public class Outer {
	private int height;
	private int width;
	public Outer(int height, int width) {
		this.height = height; this.width = width;
	}
	public Inner gerInner() {
		return new Inner();
	}
	
	class Inner{//Outer$Inner.class
		private float rate = 0.5f;
		public float capcity() {
			return rate * height * width;
		}
	}

}
