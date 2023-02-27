package ch07;

public class AnimalEx {
	public static void main(String[] args) {
		Animal[] animals = { new Pig(), new Bird(), new Fish()};
		/*Animal a1 = new Pig();
		Animal a2 = new Bird();
		Animal a3 = new Fish();*/
		Pig P = new Pig();
		Fish F = new Fish();
		Bird B = new Bird();
		
		for(Animal animal : animals) {
			animal.move();
			System.out.println("x = " + animal.x);
			if(animal instanceof Bird) {
				((Bird)animal).eat();
			}
		}
		
		/*
		 * a1.move(); a2.move(); ((Bird)a2).eat(); // 부모 선언 후 자식 생성했을 경우 그냥 선언하려고 하면 에러
		 * a3.move(); System.out.println(a1.x);
		 */
		
		System.out.println("==========");
		
		P.move();
		F.move();
		B.move();
		System.out.println(P.x);
	}
	
	

}
