package day1;

public class Sample5 {

	public static void main(String[] args) {
		// ���ǹ�
		// �� ������ ���� ����ó�� ���ǹ��� �Ǵ� �������� ���� ����Ѵ�.
        int base = 180;
        int height = 185;
        boolean isTall = height > base;
        
        if(isTall) {
        	System.out.println("Ű�� Ů�ϴ�.");
        }
        // ex2)
        int i = 3;
        boolean isOdd = i % 2 == 1;
        System.out.println(isOdd);
        // i % 2 == 1�� i�� 2�� �������� �� �������� 1������ ���� ���ǹ��̴�.
        // i�� 3�̹Ƿ� 3�� 2�� ���� �������� 1�� �Ǿ� ���� �ȴ�.
        // ���� isOdd�� true ���� ���� �� ���̴�.
	}

}
