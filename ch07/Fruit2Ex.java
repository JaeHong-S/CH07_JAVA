package ch07;

public class Fruit2Ex {
	public static void main(String[] args) {
		FruitSeller2 fs1 = new FruitSeller2("제니", 30, 1000);
		FruitSeller2 fs2 = new FruitSeller2("로제", 20, 0);
		FruitBuyer2 fb1 = new FruitBuyer2("보검", 0, 20000);
		FruitBuyer2 fb2 = new FruitBuyer2("은우", 5, 10000);
		FruitBuyer2 fb3 = new FruitBuyer2("화사", 0, 50000);
		
		fb1.buyFruit(fs1, 3000);
		fb2.buyFruit(fs2, 2000);
		fb3.buyFruit(fs1, 2000);
		
		fs1.print(); fs2.print();
		fb1.print(); fb2.print(); fb3.print();
	}

}
