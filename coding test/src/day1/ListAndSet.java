package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ListAndSet {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// List 활용 예시
		// + 리스트는 중복을 허용한다.
		String[] fruitsArray = {"apple", "banana", "kiwi", "mango"};
		ArrayList<String>  fruits = new ArrayList<>(Arrays.asList(fruitsArray));

		System.out.println("get(0) : " + fruits.get(0));
		System.out.println("get(2) : " + fruits.get(2));
		
		// Set 활용 예시
		// Set은 중복을 허용하지 않음
		Set<String> fruits2 = new HashSet<String>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");
		System.out.println("fruits: " + fruits);

	}

}
