package day1;

public class Sample9 {

	public static void main(String[] args) {
		// ���ڿ� ���� �޼ҵ�
		// String �ڷ����� ���� �޼ҵ� �߿��� ���� ���Ǵ� �͵鿡 ���ؼ� 
		
		// equals
		// equals�� �ΰ��� ���ڿ��� ���������� ���Ͽ� ������� �����Ѵ�.
		String a = "hello";
		String b = "java";
		String c = "hello";
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));

		// ���ڿ��� ���� ���Ҷ��� �ݵ�� equals�� ����ؾ� �Ѵ�.
		// == �����ڸ� ����� ��� ������ ���� ��찡 �߻��� �� �ִ�.
		String d = "hello";
		String e = new String("hello");
		System.out.println(d.equals(e));
		System.out.println(d == e);
		// �� d�� e�� ���ڿ��� ��� "hello"�� ���� �������� 
		// equals�� true, ==�� false�� �����Ѵ�.
		// ���� ������ ���� �ٸ� ��ü�̱� ������ false�� ���ϵȴ�.
		// == �� �� ���� �ڷ����� ������ ��ü������ �Ǻ��� �� ����ϴ� 
		// �������̱� ������ false�� �����Ѵ�.
		
		// indexOf
		// indexOf�� ���ڿ����� Ư�� ���ڰ� ���۵Ǵ� ��ġ�� �����Ѵ�.
		String a2 = "Hello Java";
		System.out.println(a2.indexOf("Java"));
		
		// contains
		// contains�� ���ڿ����� Ư�� ���ڿ��� ���ԵǾ� �ִ����� ���θ� �����Ѵ�.
		System.out.println(a2.contains("Java"));
		
		// charAt
		// charAt�� ���ڿ����� Ư�� ��ġ�� ���ڸ� �����Ѵ�.
		System.out.println(a2.charAt(6));
		// "Hello Java"��� ���ڿ����� "J"��� ���ڴ� �ϰ���° �����̴�.
		// ������ 6���� ���ڸ� ã�ƾ� �ϴ� ������ �ڹٴ� ���ڸ� 0���� ���� �����̴�.
		
		// replaceAll
		// replaceAll�� ���ڿ� �� Ư�� ���ڿ��� �ٸ� ���ڿ��� �ٲٰ��� �� �� ����Ѵ�.
		System.out.println(a2.replaceAll("Java", "World"));
		
		// substring
		// substring�� ���ڿ� �� Ư�� �κ��� �̾Ƴ� ��쿡 ����Ѵ�.
		System.out.println(a2.substring(0, 4));
		// ���⼭ ���ڿ��� ���� �ε����� ��ȣ�� ���Խ�Ű���� �� ��ȣ�� ���Խ�Ű�� �ʴ´ٴ� ���� �˾ƾ��Ѵ�.
		
		// toUpperCase
		// toUpperCase�� ���ڿ��� ��� �빮�ڷ� ������ �� ����Ѵ�.
		// (��� �ҹ��ڷ� ������ ���� toLowerCase ���)
		System.out.println(a2.toUpperCase());
		
		// split 
		// split �޼ҵ�� ���ڿ��� Ư�� �����ڷ� �и��ϴ� �޼ҵ��̴�.
		String split = "a:b:c:d";
		String[] result = a.split(":"); // {"a", "b", "c", "d"}
	}

}
