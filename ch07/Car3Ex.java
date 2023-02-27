package ch07;

public class Car3Ex {
	public static void main(String[] args) {
//		부모 선언 하고 자식의 객체 생성 --> 범위가 작은 곳에서 넓은 곳으로 upcasting(묵시)
		Car3 car1 = new FireEngine3();
		Car3 car2 = new Ambulance3();
		Car3 car3 = new Bus3();
//		부모를 선언하고 자식을 생성하여 대입하면 부모가 가지고 있는 메서드와 멤버 변수만 사용 가능
//		실제로 실행되는 내용은 자식 메서드
		car1.drive(); car2.drive(); car3.drive(); //car1.fire(); 자식의 메서드라 에러
		System.out.println("==============");
		Car3[] cars = {car1, car2, car3};
		for(Car3 car : cars) {
			System.out.println(car.color); //부모 변수 찍힘, 변수의 이름은 같지만 다른 변수로 인식
			car.drive(); //자식 메서드 찍힘
//			원래 FireEngine3 였던 car는 에러가 발생하지 않지만, Ambulance, Bus 의 경우에는 에러 발생
			/*
			 * FireEngine3 fe = (FireEngine3)car; fe.fire(); = ((FireEngine3)car).fire(); 
			 */
			if (car instanceof FireEngine3) // 현재 car(배열) 가  FireEngine3에서 온 것인지 확인
			((FireEngine3)car).fire(); 
		}
		
		
	}

}
