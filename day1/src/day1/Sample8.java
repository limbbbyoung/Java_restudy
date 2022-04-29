package day1;

public class Sample8 {

	public static void main(String[] args) {
		// 원시 자료형(primitive)
		// 이전에 살펴보았던 int, long, double, float, boolean
		// char 등을 자바는 원시 자료형이라고 부른다.
		// 이런 primitive 자료형은 new 키워드로 그 값을 생성할 수 없다.
		// primitive 자료형은 다음과 같이 리터럴(literal)로만 값을 세팅할 수 있다.
		boolean result = true;
		char capitalC = 'C';
		int i = 100000;
		
		// 여기서 기억해 둘 것이 String의 경우 "Happy Java"와 같이
		// 리터럴로 표기가 가능하지만 primitive 자료형은 아니다.
		// 위의 원시 자료형들의 경우 각각에 대응하는 Wrapper 클래스들이 존재한다.
		/* Wrapper 클래스
		 * int -> Integer
		 * long -> Long
		 * double -> Double
		 * float -> Float
		 * boolean -> Boolean
		 * char -> Char
		 * Wrapper클래스를 사용하면 값 대신 객체를 주고 받을 수 있어
		 * 코드를 객체 중심적으로 작성하는데 유리하다. 또한 멀티스레딩 
		 * 환경에서 동기화를 지원하기 위해서는 Wrapper 클래스가 반드시 필요하다.
		 */

	}

}
