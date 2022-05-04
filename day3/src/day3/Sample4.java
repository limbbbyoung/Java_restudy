package day3;

public class Sample4 {

	public static void main(String[] args) {
		// ��ü���� ���α׷����̶�?
		/* ������ ��� ���⸦ ����� ������ ���̴�. ���⿡ ���� 3�� �Է��ϰ�
		 * + ��ȣ�� �Է��� �� 4�� �Է��ϸ� �ᱣ������ 7�� ���� �ش�. �ٽ� �� ��
		 * + ��ȣ�� �Է��� �� 3�� �Է��ϸ� ���� �ᱣ�� 7�� 3�� ���� 10�� ���� 
		 * �ش�. �� ����� ������ ����� �ᱣ���� �׻� �޸� ��򰡿� �����ϰ� �־�� �Ѵ�.
		 */
		
		// �̷� ������ �ڹ� �ڵ�� ������ ����. ������ "���ϱ�"����� ������ �ڵ�� ������ ����.
		class Calculator {
			static int result = 0;
			
			static int add(int num) {
				result += num;
				return result;
			}
			
			int sub(int num) {
				result -= num;
				return result;
			}
		}
		
		System.out.println(Calculator.add(3));
		System.out.println(Calculator.add(4));
		// add �޼ҵ�� �Űܺ��� num���� ���� ���� ������ 
		// ����� �ᱣ���� ���� �� �����ִ� �޼ҵ��̴�.
		// ������ ����� �ᱣ���� �����ϱ� ���ؼ� result ���� ����(static)�� ����ߴ�.
		
		// �׷��� ���� Sample4 Ŭ�������� 2���� ���Ⱑ �ʿ��� ��Ȳ�� �߻��ϸ� ��� �ؾ� �ұ�?
		// �� ����� ������ �ᱣ���� �����ؾ� �ϱ� ������ ���� ���� Calculator Ŭ���� �ϳ������δ� 
		// ������� ���� ������ �� ����.
		
		// �̷� ��Ȳ�� �ذ��Ϸ��� ������ ���� Ŭ������ ���� ���� ������ �Ѵ�.
        class Calculator2{
        	static int result = 0;
        	
        	static int add(int num) {
        		result += num;
        		return result;
        	}
        }
        System.out.println(Calculator.add(3));
		System.out.println(Calculator.add(4));
		
		System.out.println(Calculator2.add(3));
		System.out.println(Calculator2.add(7));

		/* ���� 1�� �ᱣ���� ���� 2�� �ƹ� ������ ��ġ�� ������ Ȯ���� �� �ִ�.
		 * ������ ���Ⱑ 3��, 5��, 10���� ���� �� ���� �ʿ������ٸ� ��� �ؾ� �ұ�?
		 * �׶����� Ŭ������ �߰��� ���ΰ�? ���⿡ ���⳪ ���ϱ� ���� ����� �߰��ؾ� �Ѵٸ� ��Ȳ�� 
		 * ���� �� ������� ���̴�.
		 * 
		 * ���� ��ü�� ���� ����� �ʾ�����, ���� ���� ��� ��ü�� ����ϸ� 
		 * ������ ���� �����ϰ� �ذ��� �� �ִ�.
		 */
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
		
		System.out.println(cal1.add(3));
		System.out.println(cal1.add(4));
		
		System.out.println(cal2.add(3));
		System.out.println(cal2.add(7));
        // Calculator Ŭ������ static Ű���带 ��� �����ߴ�.
		
		/* Calculator Ŭ������ ���� ������ ���� cal1, cal2
		 * (�̰��� ��ü��� �θ���)�� ������ ������ �����Ѵ�.
		 * �׸��� ����(cal1, cal2)�� �ᱣ�� ���� �ٸ� ������ 
		 * �ᱣ���� ������� �������� ���� �����Ѵ�. ��ü�� ����ϸ� 
		 * ���� ����� �þ���� ��ü�� ������ �ϸ� �Ǳ� ������
		 * Ŭ�������� ����ϴ� ���� �޸� �ſ� ����������.
		 * 
		 * ���� ���� ����� �߰��Ϸ��� Calculator Ŭ������ ����ó��
		 * sub �޼ҵ带 �߰��ϸ� �ȴ�.
		 * 
		 * ��ü���� ���α׷����� ������ �ܼ��� �̰͸��� �ƴϴ�. ������ �̰�
		 * �ϳ������ε� "����ü �� ��ü�� �ʿ��� ���ϱ�?"��� �ٺ����� ������ ����
		 * �ش��� �Ǿ��� ���̴�.
		 */
	}

}
