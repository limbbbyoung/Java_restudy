package day3;

public class Sample1 {

	public static void main(String[] args) {
		// for문
		// for문도 while문과 마찬가지로 문장을 반복해서 수행
		// 해야 할 경우에 사용한다.
		
		// for문의 구조
		// 예) 전형적인 for문
		String[] numbers = {"one", "two", "three"};
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// numbers 배열의 첫번째 요소부터 마지막 요소까지 출력하는 예이다.
		// for문의 조건문은 세미클론(;)을 구분자로 세 부분으로 나뉘어진다.
		/* for(초기치; 조건문; 증가치){
		 * ...
		 * }
		 * 위 예에서 초기치는 int i=0이 되고 조건문은 i<numbers.length
		 * 그리고 증가치는 i++이 된다. 즉 i값이 numbers의 갯수보다 작은 동안
		 * 계속 i값을 1씩 증가시킨다는 의미이다. while문과 비슷하지만 뭔가
		 * 컴팩트하게 잘 짜여진 느낌이 나는것이 for문의 매력이라고 할 수 있다.
		 */

		// for문의 예제
		// for문의 쓰임새를 알기 위해서 다음을 가정해 보자.
		// "총 5명의 학생이 시험을 보았는데 시험점수가 60점이 넘으면 합격이고
		// 그렇지 않으면 불합격이다. 합격인지 불합격인지에 대한 결과를 보여준다."
		
		// 우선 5명의 학생의 시험성적을 다음과 같이 표현
		int[] marks = {90, 25, 67, 45, 80};
		// 1번 학생은 90점이고 5번 학생은 80점이다.
		
		// 이런 점술ㄹ 차례로 검사하여 합격여부를 알려주는 프로그램을 만들어보자.
		for(int i = 0; i < marks.length; i++) {
			if(marks[i] >= 60) {
				System.out.println((i+1)+"번 학생은 합격입니다.");
			} else { 
				System.out.println((i+1)+"번 학생은 불합격입니다.");
			}
		}
		
		// for와 continue
		// while문에서 알아보았던 continue가 for문에도 동일하게 적용된다.
		// 즉, for문 안의 문장을 수행하는 도중에 continue문을 만나면 for문의 처음으로 돌아간다.
		
		// 위의 예제를 그대로 이용해서 60점 이상인 사람에게는 축하 메세지를 보내고 나머지 사람에게는 
		// 아무런 메세지도 전하지 않는 프로그램을 만들어 보자.
		for(int i = 0; i < marks.length; i++) {
			if(marks[i] < 60) {
				continue;
			}
			System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
		}
		// 점수가 60점 미만인 학생일 경우에는 marks[i] < 60이 참이 되어 continue문이 수행된다.
		// 따라서 축하 메세지를 출력하는 부분을 수행하지 않고 for문의 첫부분으로 돌아가게 된다.
		// + while문과 마찬가지로 for문안에서 break문장을 만나면 for문을 벗어난다.
		
		// 이중 for문
		// for문을 두 번 이용하면 아주 간단하게 구구단을 출력해 볼 수가 있다.
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println("");
		}
		/* 위의 예를 보면 for가 두 번 사용되었다. 먼저 2부터 9까지의 
		 * 숫자가 차례로 i에 대입된다. i가 처음 2일 때 다시 for문을 만나게 된다.
		 * 이제 1부터 9까지의 숫자가 j에 대입되고 그 다음 문장인 System.out.print(i*j+" ");를 수행
		 * 따라서 i가 2일 떄 2*1, 2*2, 2*3,,, 2*9까지 차례로 수행되며 그 값을 출력하게 된다.
		 * 그 다음에는 i가 3일 때 역시 2일 때와 마찬가지로 수행될 것이고 i가 9일 때까지 계속 반복하게 된다.
		 * 
		 * 위에서 System.out.print와 System.out.println을 구분하여 사용했다.
		 * System.out.print은 줄바꿈문자(\n)을 포함하지 않고 출력을 하고
		 * System.out.println은 마지막에 줄바꿈문자(\n)을 포함하여 출력하는 차이가
		 * 있다. 즉 2단, 3단 처럼 한 단이 끝날때만 줄바꿈 문자를 출력하기 위해 위와 같이 구분하여 사용한 것이다.
		 */
	}

}
