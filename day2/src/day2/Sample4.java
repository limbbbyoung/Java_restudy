package day2;

import java.util.ArrayList;

public class Sample4 {

	public static void main(String[] args) {
		// if문
		// 조건을 판단하여 해당 조건에 맞는 상황을 
		// 수행하는데 쓰이는 것이 바로 if문이다.
		boolean money = true;
		if(money) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
		
		// if문의 기본 구조
		/* if(조건문){
		 *    <수행할 문장1>;
		 *    <수행할 문장2>;
		 *    ...
		 *    } else {
		 *    <수행할 문장A>;
		 *    <수행할 문장B>;
		 *    ...
		 *    }
		 *  조건문을 테스트 해서 참이면 if문에 속한 문장들을 
		 *  수행하고 조건문이 거짓이면 else문에 속한 문장들을 수행한다.
		 */

		// 조건문이란 무엇인가?
		// if(조건문)에 사용한 조건문은 참과 거짓을 판단하는 문장이다.
		// 즉, 위의 예에서 보았던 money가 조건문이 된다.
		// money는 true이기 때문에 if문에 속한 문장들이 수행된다.
		
		// 비교연산자
		// 이번에는 조건판단에 사용되는 비교 연산자에 대해서 알아보자
		/* 자바의 비교연산자들이다.
		 * x < y : x가 y보다 작다
		 * x > y : x가 y보다 크다 
		 * x == y : x와 y가 같다
		 * x != y : x와 y가 같지 않다
		 * x >= y : x가 y보다 크거나 같다
		 * x <= y : x가 y보다 작거나 같다
		 */
		int x = 3;
		int y = 2;
		System.out.println(x > y);
		System.out.println(x < y);
		System.out.println(x == y);
		System.out.println(x != y);
        
		// 택시 예제
		// "만약 3000원 이상의 돈을 가지고 있으면
		// 택시를 타고 그렇지 않으면 걸어가라"
		int money2 = 2000;
		if(money2 >= 3000) {
			System.out.println("택시를 타고 가라");
		} else { 
			System.out.println("걸어가라");
		}
		// money2 >= 3000 이란 조건문이 거짓이 되기 때문에
		// else문의 문장이 수행되어 "걸어가라"가 출력된다.
		
		// and(&&), or(||), not(!)
		// 이외에도 조건 판단에 쓰이는 and, or, not 연산자가 있다.
		// 각각 연산자는 다음처럼 동작한다.
		// x || y => x와 y 둘 중 적어도 하나가 참이면 참이다
		// x && y => x와 y 모두 참이어야 참이다
		// !x => x가 거짓이면 참이다
		
		// 택시 예제 활용
		// "돈이 3000원 이상 있거나 카드가 있다면 택시를 타고 그렇지 않으면
		// 걸어가라"
		boolean hashCard = true;
		if(money2>=3000 || hashCard) {
			System.out.println("택시를 타고 가라");
		} else { 
			System.out.println("걸어가라");
		}
		
		// contains
		// List 자료형에는 해당 아이템이 있는지 조사하는 contains 메소드가 있다.
		// contains 메소드는 조건문에 많이 활용되는데 어떻게 활용이 되는지 살펴보자.
		ArrayList<String> pocket = new ArrayList<>();
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("money");
		
		if(pocket.contains("money")) {
			System.out.println("택시를 타고 가라");
		} else { 
		    System.out.println("걸어가라");
		}
		
		// else if(다중 조건 판단)
		// if와 else만으로는 다양한 조건 판단을 하기가 어렵다.
		// 다음과 같은 예만 하더라도 if와 else만으로는 조건 판단에 어려움을 겪게 된다.
		// "지갑에 돈이 있으면 택시를 타고, 지갑엔 돈이 없지만 
		// 카드가 있으면 택시를 타고, 돈도 없고 카드도 없으면 걸어가라"
		// 위의 문장을 보면 조건을 판단하는 부분이 두 군데가 있다.
		// 먼저 지갑에 돈이 있는지를 판단해야 하고 지갑에 
		// 돈이 없으면 다시 카드가 있는지를 판단한다.
		if(pocket.contains("money")) {
			System.out.println("택시를 타고 가라");
		} else {
			if(hashCard) {
				System.out.println("택시를 타고 가라");
			} else {
				System.out.println("걸어가라");
			}
		}
		// if와 else가 여러번 사용되어 이해하기가 쉽지 않고 
		// 산만한 느낌이 든다. 위와 같은 점을 보완하기 위해서
		// 자바는 다중 조건 판단을 가능하게 하는 else if가 있다.
		if(pocket.contains("money")) {
			System.out.println("택시를 타고 가라");
		} else if(hashCard) {
			System.out.println("택시를 타고 가라");
		} else { 
			System.out.println("걸어가라");
		}
		// else if는 이전 조건문이 거짓일 때 수행된다.
		// 따라서 위에서 pocket.contains("money")문장이
		// 거짓이므로 else if 문이 수행되고 hashCard가 true이므로 
		// "택시를 타고 가라"가 출력
		
		// if, else if, else의 기본 구조
		/*if (조건문) {
		    <수행할 문장1> 
		    <수행할 문장2>
		    ...
		}else if (조건문) {
		    <수행할 문장1>
		    <수행할 문장2>
		    ...
		}else if (조건문) {
		    <수행할 문장1>
		    <수행할 문장2>
		    ...
		...
		} else {
		   <수행할 문장1>
		   <수행할 문장2>
		   ... 
		}*/
	}

}
