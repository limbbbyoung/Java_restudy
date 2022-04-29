package day1;

public class Sample7 {

	public static void main(String[] args) {
		// 문자열 
		// 문자열이란 문장을 뜻한다. 예를 들어 다음과 같은 것들이 문자열이다.
		/*
		 * "Happy Java"
		 * "a"
		 * "123"
		 * 
		 * 자바에서 문자열을 나타내는 자료형은 String이다.
		 * 즉, 위의 문자열을 자바에서 표현하려면 다음과 같이 사용해야한다.
		 */
		String a = "Happy Java";
		String b = "a";
		String c = "123";
		
		// 하지만 위 예제를 다음과 같이 표현해도 된다.
		String a1 = new String("Happy Java");
		String b1 = new String("a");
		String c1 = new String("123");
		// new 키워드는 객체를 만들때 사용한다.
		
		/*
		 * 첫번째 방식은 리터럴 표기(literal)
		 * 객체 생성없이 고정된 값을 그대로 대입하는 방법을 말한다.
		 * 두번째 방식은 항상 새로운 String 객체를 만든다.
		 */

	}

}
