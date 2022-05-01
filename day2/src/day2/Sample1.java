package day2;

public class Sample1 {

	public static void main(String[] args) {
		// 배열 
		/*
		 * 지금까지 우리는 숫자와 문자열에 대해서 알아보았다. 하지만 이러한 것들로 프로그래밍을 하기엔 부족한 점이 많다.
		 * 예를 들어 1부터 10까지의 숫자들 중 홀수들의 모인인 1, 3, 5, 7, 9라는 집합을 생각해 보자. 이것들을 숫자나 
		 * 문자열만으로 표현 하기는 쉽지가 않다. 바로 이러한 문제를 해결하기 위해 배열이 있다.
		 * 1부터 10까지의 숫자들 중 홀수들의 집합은 다음과 같이 int 배열로 표현 할 수 있다.
		 */
		int[] odds = {1, 3, 5, 7, 9};
		
		// 배열은 자료형 타입 바로 옆에 [] 기호를 사용하여 표현한다. 위 예제와 같이 int 자료형의 배열은 int[]로 표현되었다.
		// 요일의 집합은 다음과 같이 String 배열로 표현 할 수 있다.
		
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		// 즉, 배열이란 자료형의 종류가 아닌 자료형의 집합을 의미한다.
		
		// 배열의 길이는 고정되어 있다.
		String[] weeks2 = new String[7];
		weeks2[0] = "월";
		weeks2[1] = "화";
		weeks2[2] = "수";
		weeks2[3] = "목";
		weeks2[4] = "금";
		weeks2[5] = "토";
		weeks2[6] = "일";
		// 배열의 길이를 먼저 설정하여 배열 변수를 먼저 생성한 다음 그 값은 나중에 대입하는 방법이다.
		// 단, 위의 예처럼 "초기값 없이" 배열 변수를 만들때에는 반드시 길이에 대한 숫자값이 필요하다.
        // String[] weeks = new String[]; // 컴파일 오류 발생
		
		// 배열의 값은 어떻게 접근할 수 있을까?
		// "목"에 해당하는 값을 얻어오기
		String[] weeks3 = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println(weeks3[3]);
		
		// 배열의 길이 
		// 배열은 보통 for문과 함께 사용된다. for문에 배열이 사용될 경우 배열의 길이만큼 for문을 돌리는 것이 중요한데 
		// 배열의 길이는 다음과 같이 length를 이용하여 구한다.
		for (int i = 0; i < weeks3.length; i++) {
			System.out.println(weeks3[i]);
		}
		
		// 빈번한 배열의 오류
		// 아마 여러분이 자바 코드를 작성하면서 보게 될 가장 많은 오류중의 하나는 바로 다음의 오류일 것이다.
		// ArrayIndexOutOfBoundsException
		// 다음의 예처럼 요일 배열의 길이는 총 7개인데 만약 8번째 값을 얻으려고 시도하면 이와 같은 오류가 발생한다.
		// System.out.println(weeks3[7]); 8번째 배열값이 없으므로 ArrayIndexOutOfBoundsException 오류 발생

	}

}
