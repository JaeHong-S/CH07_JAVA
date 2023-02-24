package ch07;

public class FruitSeller3 {
	int numberOfApple, money;
	String name;
	final int PRICE_PER_APPLE = 1000;
	public FruitSeller3(String name, int numberOfApple, int money) {
		this.name = name; this.numberOfApple = numberOfApple; this.money = money;
	}

	int saleApple(int amt) {
		
		int num = amt / PRICE_PER_APPLE;
		
		if(numberOfApple >= num) {
			money += amt;
			numberOfApple -= num;
			System.out.printf("%d개 판매, 수입은 %d원\n", num, amt);
		}
		else {
			System.out.printf("사과가 떨어졌어");
			num = 0;
		}
		
		return num;

	}

	void print() {
		System.out.println("판매자 사과갯수 : " + numberOfApple);
		System.out.println("판매자 금전잔액 : " + money);
	}

}
