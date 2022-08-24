package day5;
interface Predator{
	/* 인터페이스는 class가 아닌 interface라는 키워드를 
	 * 이용하여 작성한다.
	 * 
	 * 인터페이스는 클래스와 마찬가지로 Predator.java와 같은 
	 * 단독 파일로 저장하는 것이 일반적인 방법이다.
	 * 여기서는 설명의 편의를 위해 Sample3.java 파일의 
	 * 최상단에 작성하였다.
	 * 
	 * 그리고 Tiger, Lion 클래스는 작성한 인터페이스를 
	 * 구현하도록(Implements) 수정하자.
	 */
	String getFood();
	/* [인터페이스의 메소드]
	 * getFood 라는 메소드를 추가했다. 그런데 좀 이상하다.
	 * 메소드에 몸통이 없다?
	 * 인터페이스의 메소드는 이름과 입출력에 대한 정의만 있고 그 
	 * 내용은 없다. 그 이유는 인터페이스는 규칙이기 때문이다.
	 * 위에서 설정한 getFood라는 메소드는 인터페이스를 implements한
	 * 클래스들이 구현해야만 하는 것이다.
	 * 
	 * 인터페이스에 위처럼 메소드를 추가하면 Tiger, Lion 등의 
	 * Predator인터페이스를 구현한 클래스들에서 컴파일 오류가 발생할 것이다.
	 * 오류를 해결하려면 다음과 같이 getFood 메서드를 구현해야 한다.
	 * 
	 * (아래와 같이 각 클래스에 인터페이스를 기본으로 필요로 하는 
	 * 메서드를 작성해주었으면 ZooKeeper로)
	 */
	
	default void printFood() {
		System.out.printf("my food is %s\n", getFood());
	}
	/* 디폴트 메서드는 메소드명 가장 앞에 "default"라고 표기해야한다.
	 * 이렇게 Predator 인터페이스에 printFood 디폴트 메서드를 
	 * 구현하면 Predator 인터페이스를 구현한 Tiger, Lion 등의 
	 * 실제 클래스는 printFood 메서드를 구현하지 않아도 사용할 수 있다.
	 * 그리고 디폴트 메소드는 오버라이딩이 가능하다. 즉, printFood
	 * 메소드를 실제 클래스에서 다르게 구현하여 사용할 수 있다.
	 */
	
	int LEG_COUNT = 4; // 인터페이스 상수
	
	static int speed() {
		return LEG_COUNT * 30;
	}
	/* 스태틱 메서드
	 * 자바8 버전 이후부터는 인터페이스에 스태틱 메서드를 사용할 수 있다.
	 * 인터페이스에 스태틱 메서드를 구현하면 "인터페이스명.스태틱메서드명"과 같이
	 * 사용하여 일반 클래스의 스태틱 메서드를 사용하는 것과 
	 * 동일하게 사용할 수 있다.
	 * 
	 * [인터페이스 상수]
	 * 위 코드에서 사용한 int LEG_COUNT = 4; 문장은 
	 * 인터페이스에 정의한 상수이다. 인터페이스에 정의한 상수는 
	 * int LEG_COUNT=4;처럼 public static final을 생략해도
	 * 자동으로 public static final이 적용된다.
	 */
} // Predator End 

/* 위와 같은 방식은 동물 클래스가 추가될 때마다 분기문이 추가되어야 하므로
 * 좋지 않다. 하지만 우리는 인터페이스를 배웠으므로 좀 더 나은 해법을 찾을 수 있다.
 * 
 * 다음처럼 Barkable 인터페이스를 작성하고 Tiger 클래스와 Lion 클래스가 
 * Barkable 인터페이스를 구현하도록 변경해 보자.
 */

// barkable 인터페이스를 구현
interface Barkable {
	void bark();
}
	
/*
 * barkAnimal 메소드는 입력으로 받은 animal 객체가 Tiger의 
 * 객체인 경우에는 "어흥"을 출력하고 Lion객체인 경우에는 "으르렁"을 출력한다.
 * instanceof는 어떤 객체가 특정 클래스의 객체인지를 조사할 때
 * 사용되는 자바의 내장 명령어이다. animal isntanceof Tiger는 
 * "animal 객체는 Tiger 클래스로 만들어진 객체인가?"를 묻는 조건문이다.
 * 
 * IS-A 관계
 * barkAnimal 메소드의 입력자료형은 Tiger나 Lion이 아닌 Animal이다.
 * 하지만 barkAnimal 메소드를 호출할때는 tiger 또는 lion 객체를 전달할 
 * 수가 있다. 이게 가능한 이유는 Tiger, Lion 클래스가 Animal이라는 
 * 부모 클래스를 상속한 자식 클래스이기 때문이다. 자식 클래스에 의해서 만들어진
 * 객체는 언제나 부모 클래스의 자료형으로 사용할 수가 있다.
 */
class Bouncer{
	void barkAnimal(Barkable animal) {
		animal.bark();
	}
		
		
class Animal2{
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

// 인터페이스의 구현은 implements라는 키워드를 사용한다.
class Tiger extends Animal2 implements Predator{
	public String getFood() {
		return "apple";
	}
}

class Lion extends Animal2 implements Predator, Barkable{
	public String getFood() {
		return "banana";
	}
	
	public void bark() {
		System.out.println("으르렁");
	}
}

class Crocodile extends Animal2 implements Predator{
	public String getFood() {
		return "strawberry";
	}
}

class Leopard extends Animal2 implements Predator{ 
	public String getFood() {
		return "orange";
	}
}

class ZooKeeper {
	// 인터페이스를 사용하면 다음과 같이 변경할 수 있다.
	// 변경전
	/*
	void feed(Tiger tiger) { // 호랑이가 오면 사과를 던져 준다.
		System.out.println("feed apple");
	}
	
	void feed(Lion lion) { // 사자가 오면 바나나를 던져준다.
		System.out.println("feed banana");
	}
	
	/* 이제 다음을 생각 해 보자.
	 * 동물원에 호랑이와 사자뿐이라면 ZooKeeper클래스는 더이상 
	 * 할일이 없겠지만 악어, 표범등이 계속 추가된다면 ZooKeeper는 
	 * 육식동물이 추가될 때마다 매번 다음과 같은 feed 메소드를 추가해야 한다.
	 */
	/*
	void feed(Crocodile crocodile) {
		System.out.println("feed strawberry");
	}
	
	void feed(Leopard leopard) {
		System.out.println("feed orange");
	}
	*/
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
		/* feed메소드가 "feed apple"을 출력하던 것에서 
		 * "feed " + predator.getFood()를 출력하도록 변경했다.
		 * predator.getFood()를 호출하면 Predator 인터페이스를 구현한 
		 * 구현체(Tiger, Lion)의 getFood()메소드가 호출된다.
		 */
	}
	/* feed 메소드의 입력으로 Tiger, Lion을 각각 필요로 했지만
	 * 이제 이것을 Predator라는 인터페이스로 대체할 수 있게 되었다.
	 * tiger, lion은 각각 Tiger, Lion의 객체이기도 하지만 
	 * Predator 인터페이스의 객체이기도 하기 때문에 위와같이 
	 * Predator를 자료형의 타입으로 사용할 수 있는 것이다.상속에서 
	 * 공부했던 IS-A 관계가 인터페이스에도 마찬가지로 적용된다.
	 * "Tiger is a Predator", "Lion is a Predator"가 성립
	 */
}
	/* 이렇게 육식동물이 추가 될 떄마다 feed 메소드를
	 * 추가해야 한다면 사육사(ZooKeeper)가 얼마나 귀찮겠는가?
	 * 이런 어려움을 극복하기 위해서는 인터페이스의 도움이 필요하다.
	 */
// 다형성을 위해 만드는 Bouncer


public class Sample3 {

	public static void main(String[] args) {
		/* 인터페이스 
		 * 인터페이스(Interface)는 초보 개발자를 괴롭히는 단골손님이다.
		 * 인터페이스에 대한 개념없이 코드로만 이해하려고 하면 곧 
		 * 미궁에 빠지게 된다. 이렇게 이해하기 힘든 인터페이스는 도대체
		 * 왜 필요하게 된 걸까?
		 * 
		 * 인터페이스는 왜 필요한가?
		 * 다음은 어떤 동물원 사육사가 하는 일이다.
		 *  난 동물원의 사육사이다.
		 *  육식동물이 들어오면 난 먹이를 던져준다.
		 *  호랑이가 오면 사과를 던져준다.
		 *  사자가 오면 바나나를 던져준다.
		 * 이런 케이스를 코드로 담아보자. 다음과 같이 
		 * Animal, Tiger, Lion, Zookeeper 클래스를 작성하자.
		 */
		//ZooKeeper zooKeeper = new ZooKeeper();
		// Tiger tiger = new Tiger();
		// Lion lion = new Lion(); 
		// zooKeeper.feed(tiger);
		// zooKeeper.feed(lion);
		/* 이전 챕터에서 보았던 Dog클래스와 마찬가지로 Animal을
		 * 상속한 Tiger와 Lion이 등장했다. 그리고 사육사 클래스인
		 * ZooKeeper 클래스를 위처럼 정의 하였다. ZooKeeper클래스는 
		 * 호랑이가 왔을 때, 사자가 왔을 때 각각 다른 feed 메소드가 
		 * 호출된다.
		 * 
		 * ZooKeeper 클래스의 feed 메소드처럼 입력값의 자료형 타입이 
		 * 다를 경우(위에서는 Tiger, Lion으로 서로 다르다)
		 * 메소드 명을 동일하게(여기서는 메소드명이 feed로 동일하다)
		 * 사용할 수 있다. 이런것을 "메소드 오버로딩(Method overloading)
		 * 이라고 한다.
		 * 
		 * 눈치가 빠르다면 이제 왜 인터페이스가 필요한지 감을
		 * 잡았을 것이다. 보통 중요 클래스를 작성하는 입장이라면
		 * (여기서는 ZooKeeper가 중요한 클래스이다) 클래스의 
		 * 구현체와 상관없이 인터페이스를 기준으로 중요 클래스를 
		 * 작성해야만 한다. 구현체(Tiger, Lion, Crocodile,..)
		 * 는 늘어날수 있지만 인터페이스(Predator)는 하나이기 때문이다.
		 * 
		 * 인터페이스의 메소드
		 * 자, 그런데 위 ZooKeeper 클래스에 약간의 문제가 발생했다.
		 * 아래의 ZooKeeper 클래스의 feed메소드를 보면 호랑이가 오던지,
		 * 사자가 오던지 무조건 "feed apple"이라는 문자열을 출력한다.
		 * 사자가 오면 "feed banana"를 출력해야 하지 않겠는가!
		 */
		
		/* 본 클래스에서 주석 처리 한 부분에 인터페이스에 대한 
		 * 설명을 적어놓았는데 한 클래스 내부에서 여러가지를 설명할려고 
		 * 하다보니까 뒤죽박죽 순서가 섞여있을 것이다.
		 * 점프 투 자바를 참고하여 문서의 순서대로 클래스 내부에서 확인하면 되겠다.
		 * 
		 * 그럼 마지막으로 
		 * [인터페이스의 핵심과 개념]
		 * 이번 장에서 가장 중요한 부분은 왜 인터페이스가 필요한지에 대해서 
		 * 이해하는 것이다. 육식 동물의 종류만큼의 feed 메소드가 필요했던
		 * ZooKeeper 클래스를 Predator 인터페이스를 이용하여
		 * 구현했더니 단 한개의 feed 메소드로 구현이 가능해졌다.
		 * 여기서 중요한 점은 메소드의 갯수가 줄어들었다는 점이 아니라 
		 * ZooKeeper 클래스가 동물들의 종류에 의존적인 클래스에서 
		 * 동물들의 종류와 상관없는 독립적인 클래스가 되었다는 점이다.
		 * 바로 이 점이 인터페이스의 핵심이다.
		 * (클래스들 끼리의 상속 관계에서 인터페이스를 활용하면
		 * 독립적인 관계를 형성할 수 있다는 점이 핵심인 것 같다.)
		 * 
		 * 이번에는 좀 더 개념적으로 인터페이스를 생각해 보자. 아마도 
		 * 여러분은 컴퓨터의 USB포트에 대해서 알고 있을 것이다. USB 포트에
		 * 연결할 수 있는 기기는 하드디스크, 메모리스틱, 스마트폰 등
		 * 무척 많다. 바로 이 USB 포트가 물리적 세계의 인터페이스라고 할 수 있다.
		 * USB 포트의 규격만 알면 어떤 기기도 만들 수 있다.
		 * 또 컴퓨터는 USB 포트만 제공하고 어떤 기기가 만들어지는 지 신경쓸 필요가 없다.
		 * 바로 이 점이 인터페이스와 매우 비슷하다.
		 * 위에서 만든 사육사(ZooKeeper)가 어떤 육식동물(Tiger,Lion...)이던지 
		 * 상관하지 않고 먹이를 주는 것처럼..
		 * 
		 * 물리적 세계 | 자바 세계 
		 * 컴퓨터 	  ZooKeeper
		 * USB 포트    Predator
		 * 하드디스크, 
		 * 디지털카메라,.Tiger,Lion,Crocodile..
		 * 
		 * +PLUS 점프 투 자바
		 * [상속과 인터페이스]
		 * 위에서 작성한 Predator 인터페이스 대신 Animal
		 * 클래스에 getFood 메소드를 추가하고 Tiger, Lion
		 * 등에서 getFood 메소드를 오버라이딩한 후 ZooKeeper
		 * 의 feed메소드가 Predator 대신 Animal을 입력 자료형으로
		 * 사용해도 동일한 효과를 거둘 수 있다. 하지만 상속은 
		 * 자식 클래스가 부모 클래스의 메소드를 오버라이딩하지 않고
		 * 사용할 수 있기 때문에 해당 메소드를 반드시 구현해야 
		 * 한다는 "강제성"을 갖지 못한다. 상황에 맞게 상속을 
		 * 사용할 것인지 인터페이스를 사용해야 할 지를 결정해야
		 * 겠지만 인터페이스는 인터페이스의 메소드를 반드시 구현해야
		 * 하는 "강제성"을 갖는다는 점을 반드시 기억하자.
		 * 
		 * 
		 * 디폴트 메서드
		 * 자바8 버전 이후부터는 디폴트 메서드를 사용할 수 있다.
		 * 인터페이스의 메서드는 몸통(구현체)을 가질 수 없지만
		 * 디폴트 메서드를 사용하면 실제 구현된 형태의 메서드를
		 * 가질 수 있다. 예를 들어 Predator 인터페이스에 
		 * 다음과 같은 디폴트 메서드를 추가할 수 있다.
 		 */
		

	}

}

}
