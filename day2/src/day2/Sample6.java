package day2;

public class Sample6 {

	public static void main(String[] args) {
		// while
		// while은 문장을 반복해서 수행해야 할 경우에 사용한다.
		
		// while문의 기본 구조
		// 다음은 while문의 기본 구조이다.
		/* while(조건문) { 
		 *    <수행할 문장1>;
		 *    <수행할 문장2>;
		 *    <수행할 문장3>;
		 *    ...
		 *    }
		 *    
		 *    조건문이 참인 동안 while문의 수행할 문장들을 반복하여 수행한다.
		 */
		
		// 예제) "열 번 찍어 안 넘어 가는 나무 없다"
		int treeHit=0;
		while(treeHit < 10) {
			treeHit++;
			System.out.println("나무를 " + treeHit + "번 찍었습니다.");
	        if(treeHit == 10) {
	        	System.out.println("나무 넘어갑니다.");
	        }
		}
		// while문의 조건무은 treeHit < 10이다. 즉, treeHit가 10보다 
		// 작은 동안에 while문 안의 문장들을 계속 수행한다.
		// treeHit는 treeHit += 1처럼 쓰기도 한다.
		
		// 무한루프(Loop)
		// 이번에는 무한루프에 대해서 알아보기로 하자. 무한 루프는 무한히 반복한다는
		// 의미이다. 자바에서 무한루프는 while문으로 구현 할수 있다. 우리가 
		// 사용하는 프로그램들 중에서 무한루프의 개념을 사용하지 않는 프로그램은
		// 하나도 없을 정도로 무한루프는 자주 사용된다. 다음은 무한루프의 기본적인 형태이다.
	    /* while(true) { 
	     *    <수행할 문장1>; 
	     *    <수행할 문장2>;
	     *    ...
	     *    }
	     * while의 조건문이 true 이므로 조건문은 항상 참이 된다.
	     * while은 조건문이 참인 동안에 while에 속해 있는 문장들을 계속해서
	     * 수행하므로 위의 예는 무한하게 while문 내의 문장들을 수행할 것이다. 
	     */
		
		// 예제
		//while(true) {
		//	System.out.println("Ctrl-c를 눌러야 while문을 빠져 나갈 수 있습니다.");
		//}
		
		// while문 빠져 나가기(break)
		/* while문은 조건문이 참인 동안 계속해서 while문 안의 내용을 반복하여
		 * 수행한다. 하지만 강제로 while문을 빠져나가야 할 때도 있다.
		 * 
		 * 커피 자판기를 생각해 보자. 커피가 자판기 안에 충분하게 있을 때는 항상
		 * "돈을 받으면 커피를 줘라"라는 조건문을 가진 while문이 수행된다.
		 * 자판기가 제 역할을 하려면 커피의 양을 따로이 검사를 해서 커피가 다
		 * 떨어지면 while문을 멈추게 하고 "판매중지"란 문구를 자판기에 보여야 할
		 * 것이다. 이렇게 while문을 강제로 멈춰야 할 때 사용하는 것이 바로 break이다.
		 */
		
		int coffee = 10;
		int money = 300;
		while(money > 0) {
			System.out.println("돈을 받았으니 커피를 줍니다.");
			coffee--;
			System.out.println("남은 커피의 양은 " + coffee + "입니다.");
			if(coffee == 0) {
				System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
				break;
			}
		}
		
		// while문 조건문으로 돌아가기(continue)
		/* while문 안의 문장을 수행할 때 어떤 조건을 검사해서 조건에 맞지 않는 경우
		 * while문을 빠져나가는 대신 while문의 맨 처음(조건문)으로 돌아가게 하고 싶은 경우도 있다.
		 */

		// 예)continue의 사용
		int a = 0;
		while(a < 10) {
			a++;
			if(a % 2 == 0) {
				continue;
			}
			System.out.println(a);
		}
	}

}
