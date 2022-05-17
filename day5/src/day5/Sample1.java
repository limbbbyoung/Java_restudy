package day5;

class Animal {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	Dog(){
		
	}
	/* 생성자의 입력 항목이 없고 생성자 내부에 아무 내용이 없는 
	 * 위와 같은 생성자를 디폴트 생성자라고 부른다.
	 * 
	 * 위와 같이 디폴트 생성자를 구현하면 new Dog()로 Dog 클래스의
	 * 객체가 만들어질 때 위에 구현한 디폴트 생성자가 실행될 것이다.
	 * 만약 클래스에 생성자가 하나도 없다면 컴파일러는 자동으로 
	 * 위와같은 디폴트 생성자를 추가한다. 하지만 사용자가 작성한 
	 * 생성자가 하나라도 구현되어 있다면 컴파일러는 디폴트 생성자를 
	 * 추가하지 않는다.
	 */
	// 부모 클래스의 기능을 확장
	// 이번에는 Dog클래스에 sleep 메소드를 추가 해 보자.
	void sleep() {
		System.out.println(this.name+" zzz");
	}
	
}
/* 클래스 상속을 위해서는 extends라는 키워드를 사용한다.
 * 이제 Dog 클래스는 Animal 클래스를 상속하게 되었다. Dog클래스에 
 * name이라는 객체변수와 setName이라는 메소드를 만들지 않았지만 
 * Animal 클래스를 상속했기 때문에 그대로 사용이 가능하다.
 */

/* 메소드 오버라이딩(Method overriding)
 * 이번에는 Dog클래스를 좀 더 구체화 시키는 HouseDog클래스를
 * 만들어 보자. HouseDog 클래스는 Dog클래스를 상속하여 다음과 같이 만들 수 있다.
 */
class HouseDog extends Dog {
	HouseDog(String name){
		this.setName(name);
	}
	
	// 생성자 오버로딩 
	// 메소드에 오버로딩이 있는 것과 마찬가지로 생성자에도 오버로딩이 있다.
	// * 하나의 클래스에 여러개의 입력항목이 다른 생성자를 만들 수 있다.
	
	void sleep(int hour) {
		System.out.println(this.name + " zzz in house for " + hour + " hours");
	}
	/* 첫번째 수정 전 아무것도 없었음
	 * 두번째 수정 전 
	 * void sleep() {
		System.out.println(this.name + " zzz in house");
	   }
	 */
}
public class Sample1 {

	public static void main(String[] args) {
		/* 상속
		 * 자바에서는 자식 클래스가 부모 클래스의 기능을 그대로 
		 * 물려받을 수 있는 상속(Inheritance) 기능이 있다.
		 * 예제를 통해서 자바의 상속에 대해서 자세히 알아보자.
		 */
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name);
		dog.sleep();
		/* 이제 Dog 클래스는 Animal 클래스보다 좀 더 많은 기능
		 * (sleep메소드가 추가되었다.)을 가지게 되었다. 이렇듯
		 * 보통 부모 클래스를 상속받은 자식 클래스는 부모 클래스의 
		 * 기능에 더하여 좀 더 많은 기능을 갖도록 작성한다.
		 */
		
		/* IS-A 관계 
		 * Dog 클래스는 Animal 클래스를 상속했다. 즉, Dog는 
		 * Animal의 하위 개념이라고 할 수 있다. 이런 경우 Dog는
		 * Animal에 포함되기 때문에 "개는 동물이다"라고 표현할 수 있다.
		 * 
		 * 자바는 이러한 관계를 IS-A 관계라고 표현한다. 즉, "Dog is a Animal"
		 * 과 같이 말할 수 있는 관계를 IS-A 관계라고 한다. 이렇게
		 * IS-A 관계(상속관계)에 있을 때 자식 클래스의 객체는 부모
		 * 클래스의 자료형인 것처럼 사용할 수 있다.
		 * 즉, 다음과 같은 코딩이 가능하다.
		 */
		Animal dog1 = new Dog(); // Dog is a Animal
		// 다만 여기서 한 가지 주의해야 할 점이 있다. Dog객체를 
		// Animal 자료형으로 사용할 경우에는 Dog 클래스에만 존재하는 
		// sleep메소드를 사용할 수 없다는 점이다. 이런 경우에는 
		// Animal 클래스에 구현된 setName메소드만 사용이 가능하다.
		// 하지만 이 반대의 경우, 즉 부모 클래스로 만들어진 객체를 
		// 자식 클래스의 자료형으로는 사용할 수 없다.
		
		/* Object3 클래스
		 * 자바에서 만드는 모든 클래스는 Object 클래스를 상속받는다.
		 * 사실 우리가 만든 Animal 클래스는 다음과 기능적으로 완전히 동일하다.
		 * 하지만 굳이 아래 코드처럼 Object 클래스를 상속하도록 
		 * 코딩하지 않아도 자바에서 만들어지는 모든 클래스는 Object클래스를 
		 * 자동으로 상속받게끔 되어 있다.
		 * class Animal extends Object {
		    String name;
		
		    void setName(String name) {
		        this.name = name;
			    }
			}
			따라서 자바에서 만드는 모든 객체는 Object 자료형으로 
			사용할 수 있다. 즉, 다음과 같이 코딩하는 것이 가능하다.
		 */
		Object animal = new Animal(); // Animal is a Object
		Object dog2 = new Dog(); // Dog2 is a Object

		// 메소드 오버라이딩 코드 작성
		// HouseDog houseDog = new HouseDog();
		// houseDog.setName("happy");
		// houseDog.sleep(); // happy zzz 출력
		// HouseDog 클래스를 실행 해 보면 sleep 메소드가 
		// 호출되어 다음과 같은 결과가 출력될 것이다.
		// (콘솔에서 확인)
		/* 그런데 HouseDog처럼 집에서 키우는 개들은 잠을 집에서만 
		 * 잔다고 한다. HouseDog 클래스로 만들어진 객체들은 
		 * sleep메소드 호출 시 "happy zzz"가 아닌 
		 * "happy zzz in house"를 출력해야 한다고 가정 해 보자.
		 * 이렇게 하려면 어떻게 해야 할까?
		 * 다음과 같이 HouseDog클래스를 수정
		 * (위 HouseDog 클래스 확인)
		 * 
		 * HouseDog 클래스에 Dog클래스와 동일한 형태(입출력이 동일)의 
		 * sleep 메소드를 구현하면 HouseDog 클래스의 sleep
		 * 메소드가 Dog클래스의 sleep메소드보다 더 높은 우선순위를 
		 * 갖게 되어 HouseDog클래스의 sleep메소드가 호출되게 된다.
		 * 
		 * 이렇게 부모클래스의 메소드를 자식클래스가 동일한 형태로 
		 * 또다시 구현하는 행위를 "메소드 오버라이딩(Method Overriding)"이라고 한다.
		 */
		
		/* 메소드 오버로딩(method overloading)
		 * 이번에는 HouseDog 클래스에 다음과 같은 메소드를 추가해 보자.("변경"이 아니라 "추가"임에 주의하자.)
		 * (위 HouseDog 클래스 확인)
		 * 이미 sleep이라는 메소드가 있지만 동일한 이름의 
		 * sleep메소드를 또 생성할 수 있다. 단, 메소드의 입력항목
		 * 다를 경우만 가능하다. 새로 만든 sleep메소드는 입력항목으로 
		 * hour라는 int 자료형이 추가되었다.
		 * 
		 * 이렇듯 입력항목이 다른 경우 동일한 이름의 메소드를 
		 * 만들 수 있는데 이를 "메소드 오버로딩(method overloading)이라고 부른다.
		 */
		// houseDog.sleep(3);
		
		/* 다중 상속 
		 * 다중 상속은 클래스가 동시에 하나 이상의 클래스를 상속받는 것을 뜻한다.
		 * C++, 파이썬 등 많은 언어들이 다중 상속을 지원하지만 
		 * 자바는 다중 상속을 지원하지 않는다.
		 */
	}

}
