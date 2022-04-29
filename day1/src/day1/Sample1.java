package day1;

public class Sample1 {

	public static void main(String[] args) {
		/* 정수
		 자바의 정수를 표현하기 위한 자료형은 int, long 이다.(byte, short 등도 있지만
		 잘 사용하지 않는다.)
         int와 long의 차이는 표현할 수 있는 숫자의 범위이다. 
		 */
		int age = 10;
		long countOfStar = 8764827384923849L;
		/*
		 long 변수에 값을 대입할 때는 대입하는 숫자 값이 int 자료형의 최대값인 
		 2147483647 보다 큰 경우 L접미사를 붙여 주어야한다.만약 큰 숫자에 
		 'L'과 같은 접미사를 누락하면 컴파일 에러가 발생한다.
		 */
		
		/* 실수 
		 자바의 실수를 표현하기 위한 자료형은 float, double이다.
		 float와 double의 차이 역시 표현할 수 있는 숫자의 범위이다.
		 */
		float pi = 3.14F;
		double morePi = 3.14159265358979323846;
		// 자바에서 실수형은 디폴트가 double이므로 위의 예에서 보듯이 float 변수에 값을 
		// 대입할 때에는 3.14F 와 같이 F접미사(소문자도 가능)를 꼭 붙여 주어야 한다.
		// float 자료형에 값을 대입할 때 접미사를 누락하면 컴파일 에러가 발생한다.
		// 또는 과학적 지수 표현식으로 다음과 같이 사용할 수 있다.
		double d1 = 123.4;
		double d2 = 1.234e2;
		// d1과 d2의 값은 123.4로 같다. d2의 e2는 10의 제곱을 의미한다.
		
	}

}
