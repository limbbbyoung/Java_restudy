package day1;

public class Sample9 {

	public static void main(String[] args) {
		// 문자열 내장 메소드
		// String 자료형의 내장 메소드 중에서 자주 사용되는 것들에 대해서 
		
		// equals
		// equals는 두개의 문자열이 동일한지를 비교하여 결과값을 리턴한다.
		String a = "hello";
		String b = "java";
		String c = "hello";
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));

		// 문자열의 값을 비교할때는 반드시 equals를 사용해야 한다.
		// == 연산자를 사용할 경우 다음과 같은 경우가 발생할 수 있다.
		String d = "hello";
		String e = new String("hello");
		System.out.println(d.equals(e));
		System.out.println(d == e);
		// 위 d와 e는 문자열은 모두 "hello"로 같은 값이지만 
		// equals는 true, ==는 false를 리턴한다.
		// 값은 같지만 서로 다른 객체이기 때문에 false가 리턴된다.
		// == 은 두 개의 자료형이 동일한 객체인지를 판별할 때 사용하는 
		// 연산자이기 때문에 false를 리턴한다.
		
		// indexOf
		// indexOf는 문자열에서 특정 문자가 시작되는 위치를 리턴한다.
		String a2 = "Hello Java";
		System.out.println(a2.indexOf("Java"));
		
		// contains
		// contains는 문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴한다.
		System.out.println(a2.contains("Java"));
		
		// charAt
		// charAt은 문자열에서 특정 위치의 문자를 리턴한다.
		System.out.println(a2.charAt(6));
		// "Hello Java"라는 문자열에서 "J"라는 문자는 일곱번째 문자이다.
		// 하지만 6으로 문자를 찾아야 하는 이유는 자바는 숫자를 0부터 세기 때문이다.
		
		// replaceAll
		// replaceAll은 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용한다.
		System.out.println(a2.replaceAll("Java", "World"));
		
		// substring
		// substring은 문자열 중 특정 부분을 뽑아낼 경우에 사용한다.
		System.out.println(a2.substring(0, 4));
		// 여기서 문자열의 시작 인덱스의 번호는 포함시키지만 끝 번호는 포함시키지 않는다는 것을 알아야한다.
		
		// toUpperCase
		// toUpperCase는 문자열을 모두 대문자로 변경할 때 사용한다.
		// (모두 소문자로 변경할 때는 toLowerCase 사용)
		System.out.println(a2.toUpperCase());
		
		// split 
		// split 메소드는 문자열을 특정 구분자로 분리하는 메소드이다.
		String split = "a:b:c:d";
		String[] result = a.split(":"); // {"a", "b", "c", "d"}
	}

}
