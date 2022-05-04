package day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample2 {

	public static void main(String[] args) {
		// for each��
		// for each ��� Ű���尡 ���� �ִ� ���� �ƴϰ� 
		// ������ for�� �̿��Ѵ�. ������ ���ǽ� �κ��� ������ ���� �ٸ���.
		String[] numbers = {"one", "two", "three"};
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// �� for���� ����ó�� for each ������ ������ �� �ִ�.
		for(String number : numbers) {
			System.out.println(number);
		}
		// for each���� ���⿡ �ſ� �������̴�.
		// for each���� ����
		/* for(type var : iterate) {
		 *     body-of-loop
		 *     }
		 * ������ iterate�� ������ ���� ��ü�̰� iterate ��ü���� �Ѱ��� 
		 * ���������� var�� ���ԵǾ� for���� ����ȴ�.
		 * iterate�� ����� �� �ִ� �ڷ����� ������ ������ �ִ� �ڷ���(�迭 �� ArrayList ��)�� �����ϴ�.
		 * 
		 * ������ �� ������ ArrayList�� ������ �����̴�. for���� ������ String[] �迭�� ������� ����
		 * ������ �����ϴ�.
		 */
		
		ArrayList<String> numbers2 = new ArrayList<>(Arrays.asList("one", "two", "three"));
		for(String number2 : numbers2) {
			System.out.println(number2);
		}
		// ��, for each���� ���� �ݺ�ȸ���� ��������� �ִ� ���� �Ұ����ϰ� 
		// 1���Ǿ� ���������� �ݺ��ɶ��� ��밡���ϴٴ� ������ �ִ�.
	}

}
