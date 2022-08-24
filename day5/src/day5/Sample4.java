package day5;

public class Sample4 {

	public static void main(String[] args) {
		// 다형성
		/* 객체지향 프로그래밍 특징 중에는 다형성(폴리모피즘, Polymorphism)이 있다.
		 * 도대체 다형성은 무엇이고 이게 왜 필요한 걸까?
		 * 
		 * Sample3을 참고하면 다형성에 대해서 이해할 수 있음
		 * 
		 * 인터페이스는 위에서 보듯이 콤마(,)를 이용하여 여러개를 implements 할 수
		 * 있다. Tiger, Lion 클래스는 Predator 인터페이스와 Barkable 인터페이스를
		 * implements 하였다. 따라서 Tiger, Lion 클래스는 bark 메소드를 위와 같이 구현해야 한다.
		 * 이렇게 Tiger, Lion 클래스에 bark 메소드를 구현하면 Bouncer 클래스의 
		 * barkAnimal 메소드를 위처럼 수정할 수 있다.
		 *
		 * 결국 다형성(polymorphism)을 이용하면 위의 예에서 보듯이 
		 * 복잡한 형태의 분기문을 간단하게 처리할 수 있는 경우가 많다.
		 * 
		 * 이렇게 하나의 객체가 여러개의 자료형 타입을 가질 수 있는 것을 
		 * 객체지향 세계에서는 다형성(Polymorphism)이라고 한다.
		 *  Tiger tiger = new Tiger();  // Tiger is a Tiger
			Animal animal = new Tiger();  // Tiger is a Animal
			Predator predator = new Tiger();  // Tiger is a Predator
			Barkable barkable = new Tiger();  // Tiger is a Barkable
		 * 
		 * */

	}

}
