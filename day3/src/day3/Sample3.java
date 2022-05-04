package day3;

public class Sample3 {

	public static void main(String[] args) {
		// 연습 문제
		// Q1. 출력결과 예상하기
		String a = "write once, run anywhere";
		if(a.contains("wife")) {
			System.out.println("wife");
		} else if(a.contains("once") && !a.contains("run")) {
			System.out.println("once");
		} else if(!a.contains("everywhere")) {
			System.out.println("everywhere");
		} else if(a.contains("anywhere")) {
			System.out.println("anywhere");
		} else {
			System.out.println("none");
		} // 출력 결과는 무엇일까?(눈으로 해석하고 맞추기)

		// Q2. while문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합을 구해 보자.
		int b = 1;
		int sum = 0;
		while(1<=b && b<=1000) {
			if(b%3==0) {
				sum += b;
			} 
			b++;
		}
		System.out.println(sum);
		
		// Q3. while문 또는 for문을 사용하여 다음과 같이 별(*)을 표시하는 프로그램을 작성해보자.
		for(int i = 0; i<5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q4 .for문을 사용해 1부터 100까지의 숫자를 출력해보자.
		for(int i =1; i <= 100; i++) {
			System.out.println(i);
		}
		
		// Q5 .A학급에 총 10명의 학생이 있다. 이 학생들의 중간고사 점수는 다음과 같다.
		int[] marks = {70, 60, 55, 75, 95, 90, 80, 85, 100};
		// for each문을 사용하여 A학급의 평균 점수를 구해보자.
		int sum2 = 0;
		for(int mark : marks) {
			sum2 += mark;
		}
		int aver = sum2/marks.length;
		System.out.println(aver);
	}

}
