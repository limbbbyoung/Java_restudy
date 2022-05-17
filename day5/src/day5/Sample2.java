package day5;

public class Sample2 {

	public static void main(String[] args) {
		// 생성자
		// HouseDog dog = new HouseDog();
		// System.out.println(dog.name);
		
		/* dog객체의 name변수에 아무런 값도 설정하지 않았기 때문에
		 * null이 출력될 것이다. 이렇듯 HouseDog클래스는 코딩하기에 
		 * 따라 객체변수 name에 값을 설정할 수도 있고 설정 안할 수도 있다.
		 * 그렇다면 name이라는 객체변수에 값을 무조건 설정해야만 객체가 
		 * 생성될 수 있도록 강제할 수 있는 방법은 없을까?
		 * 
		 * 생성자(Constructor)를 이용하면 된다.
		 * 메소드명이 클래스명과 동일하고 리턴 자료형을 정의하지 않는
		 * 메소드를 생성자(Constructor)라고 한다.
		 * 
		 * 생성자의 규칙
		 * 1. 클래스명과 메소드명이 동일하다.
		 * 2. 리턴타입을 정의하지 않는다.( void도 사용하지 않는다.)
		 * 
		 * 생성자는 객체가 생성될 때 호출된다. 즉, 생성자는 다음과 같이
		 * new 키워드가 사용될 때 호출된다.
		 * ex) new 클래스명(입력인수, ...)
		 * 생성자는 메서드와 마찬가지로 다양한 입력을 받을 수 있다.
		 * 우리가 HouseDog 클래스에 만든 생성자는 다음과 같이 
		 * 입력값으로 문자열을 필요로 하는 생성자이다.
		 * HouseDog(String name) {
           this.setName(name);
           } 
		 */
		HouseDog dog = new HouseDog("happy"); // 생성자 호출 시 문자열을 전달해야 한다.
		// 문자열을 필요로 하는 생성자에 아무것도 입력 안할시 
		// 컴파일 오류가 발생함
	}

}
