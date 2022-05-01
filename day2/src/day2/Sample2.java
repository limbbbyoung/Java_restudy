package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample2 {

	public static void main(String[] args) {
		// 리스트(List)
		/* 리스트는 배열과 비슷한 자바의 자료형으로 배열보다 편리한 기능을 많이 가지고 있다.
		 * 리스트와 배열의 가장 큰 차이는 크기가 정해져 있지 않고 동적으로 변한다는 점이다.
		 * 배열은 크기가 정해져 있다. 예를 들어 배열의 크기를 10개로 정했다면 10개 이상의 값을 담을 수는 없다.
		 * 하지만 리스트는 크기가 정해져 있지 않아 원하는 만큼의 값을 담을 수 있다.
		 * 박찬호 선수의 투구스피드를 저장해야 한다고 가정해 보자. 배열을 이용하여 투구수를 저장할 수 있을까?
		 * 1회에 투구수가 3개도 될 수 있고 100개도 될 수 있지 않은가? 프로그래밍 시 크기를 알 수 있는 상황도 있지만 
		 * 명확한 크기를 알 수 없는 경우가 더 많다. 이렇게 동적으로 자료형의 갯수가 가변하는 상황이라면 List를 사용하는 것이 유리
		 */
		
		// ArrayList 
		// List 자료형 중 가장 간단한 형태의 자료형인 ArrayList에 대해서 알아보자.
		// List 자료형 
		// List 자료형에는 ArrayList, Vector, LinkedList 등의 List 인터페이스를 구현한 자료형이 있다.
		// 인터페이스는 추후에
		
		// add
		// 박찬호 선수가 총 3번의 투구를 138, 129, 142(km)의 속도로 던졌다면 다음과 같이 코드를 작성할 수 있다.
		ArrayList pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		// ArrayList 객체인 pitches에 add라는 메소드를 이용하여 투구 스피드를 저장했다.
		// 만약 첫번째 위치에 "133"이라는 투구 스피드를 삽입하고 싶다면 아래와 같이 삽입할 위치를 파라미터로 넘겨주어야 한다.
		pitches.add(0, "133");
		// 만약 2번째 위치에 133을 삽입 할 경우에는 다음과 같이 코딩하면 된다.
		pitches.add(1, "133");
		
		// get 
		// 박찬호 선수의 2번째 투구 스피드를 출력하고 싶다면 다음과 같이 한다.
		System.out.println(pitches.get(1));
		// ArrayList의 get메소드를 이용하면 특정 인덱스의 값을 추출할 수 있다.
		
		// size
		// size 메소드는 ArrayList의 갯수를 리턴한다.
		System.out.println(pitches.size());
		
		// contains
		// contains 메소드는 리스트 안에 해당 항목이 있는지를 판별하여 그 결과 boolean으로 리턴한다.
		System.out.println(pitches.contains("142"));
		
		// remove
		// remove 메소드에는 2가지 방식이 있다.
		// 1. remove(객체)
		// 2. remove(인덱스)
		// 첫번째 remove의 경우 리스트에서 객체에 해당되는 항목을 삭제하고 삭제한 결과(true, false)를 리턴한다.
		System.out.println(pitches.remove("129"));
		// 수행 결과는 true, "129"라는 항목이 성공적으로 삭제되고 true를 리턴한다.
		
		// 두번째 remove(인덱스)의 경우는 해당 인덱스의 항목을 삭제하고 삭제된 항목을 리턴한다.
		System.out.println(pitches.remove(0));
		
		// 추가적인 개념 : 제네릭스
		// 업데이트 된 자바에서 ArrayList<String> pitches = new ArrayList<>(); 처럼
		// 객체를 포함하는 자료형도 어떤 객체를 포함하는지에 대해서 명확하게 표현할 것을 권고하고 있다.
		// 다음과 같은 것이 제네릭스이다.
		ArrayList<String> pitchesGene = new ArrayList<String>();
		// 하지만 보통 뒷 부분의 자료형은 굳이 적지 않아도 명확하기 때문에 다음의 표기법을 사용하는 것이 좋다.
		ArrayList<String> pitchesGene2 = new ArrayList<>(); // 선호되는 방식
		// 추가적으로 만약 앞 뒤에 모두 자료형 타입을 적을 경우 인텔리제이와 같은 IDE에서는 경고메세지를 출력한다.
		
		// 제네릭스가 도입되기 전에는 위의 코드를 다음과 같이 사용했다.
		// ArrayList pitchesGene = new ArrayList();
		// 두 개 코드의 차이점은 ArrayList 라는 자료형 타입 바로 옆에 <String>과 같은 문구가 있으냐 없느냐의 차이이다.
		// 위에서 사용한 첫번째 코드의 <String>이라는 제네릭스 표현식은 "ArrayList안에 담을 수 있는 자료형은 
		// String 타입 뿐이다."라는 것을 의미한다.
		// 여기서는 제네릭스의 타입으로 String 자료형만을 예로 들었지만 <Integer>, <Animal>, <Dog> 등
		// 어떤 자료형도 사용할 수 있다.
		
		// 즉, 제네릭스를 이용하면 좀 더 명확한 타입체크가 가능해 진다. 이것은 코드를 작성할 때도 몇가지 이득을 준다.
		// 우선 제네릭스를 사용하지 않은 경우를 생각해 보자.
		ArrayList pitches2 = new ArrayList();
	    pitches2.add("138");
	    pitches2.add("129");
	    
	    String one = (String)pitches2.get(0);
	    String two = (String)pitches2.get(1);
	    // 위처럼 제네릭스를 사용하지 않을 경우에는 ArrayList 안에 추가되는 객체는 Object 자료형으로 인식된다.
	    // Object 자료형은 모든 객체가 상속하고 있는 가장 기본적인 자료형이다.
	    // 따라서 ArrayList 객체인 pitches에 값을 넣을 때는 문제가 안되지만 값을 가져올 경우에는 
	    // 항상 Object 자료형에서 String 자료형으로 다음과 같이 형변환(casting)을 해 주어야하만 한다.
	    String one1 = (String)pitches2.get(0); // Object 자료형을 String 자료형으로 캐스팅한다.
	    
	    // 또 한가지 주의할 점은 pitches 안에는 String 객체 이외의 객체도 넣을 수 있기 때문에
	    // 형 변환 과정에서 잘못된 형변환으로 인한 오류가 발생할 가능성이 있다는 점이다.
	    // 바로 이러한 점이 제네릭스의 탄색 이유이기도 하다.
	    // 위 코드를 제네릭스를 사용하여 변경하면 다음과 같이 된다.
	    ArrayList<String> pitches3 = new ArrayList<>();
	    pitches3.add("138");
	    pitches3.add("129");
	    
	    String one3 = pitches3.get(0);
	    String two3 = pitches3.get(1); // 형 변환이 필요없다.
	    // 제네릭스로 자료형을 선언하기만 하면 그 이후로는 자료형에 대한 형변환 과정이 필요없다.
	    // 이미 컴파일러가 pitches에는 반드시 String 자료형만 추가 되어야 함을 알기 때문이다.
	    // 이미 제네릭스를 이용하면 형변환에 의한 불필요한 코딩과 잘못된 형변환에 의한 런타임 오류를 방지할 수 있다.
	    
	    // 다양한 방법으로 ArrayList 만들기
	    pitches3.add("142");
	    System.out.println(pitches3); 
	    
	    // 다음처럼 이미 데이터가 존재할 경우에는 보다 편하게 ArrayList를 생성할 수 있다.
	    String[] data = {"138", "129", "142"}; // 이미 투구수 데이터 배열이 있다.
	    ArrayList<String> pitches4 = new ArrayList<>(Arrays.asList(data));
		System.out.println(pitches4);
		// java.util.Arrays 클래스의 asList 메소드를 사용하면 
		// 이미 존재하는 문자열 배열로 ArrayList를 생성할 수 있다.
		// 또 다음과 같이 String 배열 대신 String 자료형을 여러개 전달하여 
		// 생성할 수도 있다.
		ArrayList<String> pitches5 = new ArrayList<>(Arrays.asList("138", "129", "142"));
		System.out.println(pitches5);
		
		// String.join
		// 앞에서 "138", "129", "142"의 요소로 이루어진 ArrayList를 만들어 보았다.
		// 그렇다면 이렇게 만들어진 ArrayList의 각 요소를 콤마(",")로 구분하여 
		// 다음과 같은 하나의 문자열로 만들 수 있는 방법이 있을까?
		ArrayList<String> pitches6 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = "";
        for (int i = 0; i < pitches6.size(); i++) {
        	result += pitches6.get(i);
        	result += ","; // 콤마를 추가한다.
        }
        result = result.substring(0, result.length() - 1); // 마지막 콤마를 제거한다.
        System.out.println(result); 
        
        // 위 예는 pitches6를 갯구만큼 루프를 돌면서 뒤에 콤마를 더하고
        // 최종적으로 마지막 콤마를 제거하는 방법이다. 위 예에서도 볼 수 있듯이 
        // 리스트의 각각의 요소 사이에 구분자를 끼워넣어 하나의 문자열로 
        // 만드는 것은 꽤 까다로운 일이다.
        // 하지만  String.join을 사용하면 다음처럼 매우 간단하게 처리할 수 있다.
        String result2 = String.join(",", pitches6);
        System.out.println(result2);
        // String.join("구분자", 리스트객체)와 같이 사용하여 리스트의 각 
        // 요소에 "구분자"를 삽입하여 하나의 문자열로 만들 수 있다.
        
        // String.join은 다음처럼 문자열 배열에도 사용할 수 있다.
        String[] pitches7 = new String[]{"138", "129", "142"};
        String result3 = String.join(",", pitches7);
        System.out.println(result3);
        // String.join 메소드는 Java8 버전부터 사용할수 있다.
        
        // 리스트 정렬하기
        // 이번에는 "138", "129", "142"의 요소로 이루어진 ArrayList를 
        // 순서대로 정렬해 보자. 순서대로 정렬하기 위해서는 다음처럼 
        // 리스트의 sort 메소드를 사용해야 한다.
        pitches6.sort(Comparator.naturalOrder()); // 오름차순으로 정렬
        System.out.println(pitches6);
        
        // sort 메소드에는 정렬기준을 파라미터로 전달해야 한다. 정렬기준에는 
        // 다음처럼 오름차순, 내림차순이 있다.
        // 오름차순(순방향) 정렬 : Comparator.naturalOrder()
        // 내림차순(역방향) 정렬 : Comparator.reverseOrder()
        // sort 메소드로 정렬후에 pitches6를 [129, 138, 142]처럼 
        // 오름차순으로 정렬되어 출력되는 것을 확인할 수 있다.
 	}

}
