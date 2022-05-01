package day2;

import java.util.ArrayList;

public class Sample4 {

	public static void main(String[] args) {
		// if��
		// ������ �Ǵ��Ͽ� �ش� ���ǿ� �´� ��Ȳ�� 
		// �����ϴµ� ���̴� ���� �ٷ� if���̴�.
		boolean money = true;
		if(money) {
			System.out.println("�ýø� Ÿ�� ����");
		} else {
			System.out.println("�ɾ��");
		}
		
		// if���� �⺻ ����
		/* if(���ǹ�){
		 *    <������ ����1>;
		 *    <������ ����2>;
		 *    ...
		 *    } else {
		 *    <������ ����A>;
		 *    <������ ����B>;
		 *    ...
		 *    }
		 *  ���ǹ��� �׽�Ʈ �ؼ� ���̸� if���� ���� ������� 
		 *  �����ϰ� ���ǹ��� �����̸� else���� ���� ������� �����Ѵ�.
		 */

		// ���ǹ��̶� �����ΰ�?
		// if(���ǹ�)�� ����� ���ǹ��� ���� ������ �Ǵ��ϴ� �����̴�.
		// ��, ���� ������ ���Ҵ� money�� ���ǹ��� �ȴ�.
		// money�� true�̱� ������ if���� ���� ������� ����ȴ�.
		
		// �񱳿�����
		// �̹����� �����Ǵܿ� ���Ǵ� �� �����ڿ� ���ؼ� �˾ƺ���
		/* �ڹ��� �񱳿����ڵ��̴�.
		 * x < y : x�� y���� �۴�
		 * x > y : x�� y���� ũ�� 
		 * x == y : x�� y�� ����
		 * x != y : x�� y�� ���� �ʴ�
		 * x >= y : x�� y���� ũ�ų� ����
		 * x <= y : x�� y���� �۰ų� ����
		 */
		int x = 3;
		int y = 2;
		System.out.println(x > y);
		System.out.println(x < y);
		System.out.println(x == y);
		System.out.println(x != y);
        
		// �ý� ����
		// "���� 3000�� �̻��� ���� ������ ������
		// �ýø� Ÿ�� �׷��� ������ �ɾ��"
		int money2 = 2000;
		if(money2 >= 3000) {
			System.out.println("�ýø� Ÿ�� ����");
		} else { 
			System.out.println("�ɾ��");
		}
		// money2 >= 3000 �̶� ���ǹ��� ������ �Ǳ� ������
		// else���� ������ ����Ǿ� "�ɾ��"�� ��µȴ�.
		
		// and(&&), or(||), not(!)
		// �̿ܿ��� ���� �Ǵܿ� ���̴� and, or, not �����ڰ� �ִ�.
		// ���� �����ڴ� ����ó�� �����Ѵ�.
		// x || y => x�� y �� �� ��� �ϳ��� ���̸� ���̴�
		// x && y => x�� y ��� ���̾�� ���̴�
		// !x => x�� �����̸� ���̴�
		
		// �ý� ���� Ȱ��
		// "���� 3000�� �̻� �ְų� ī�尡 �ִٸ� �ýø� Ÿ�� �׷��� ������
		// �ɾ��"
		boolean hashCard = true;
		if(money2>=3000 || hashCard) {
			System.out.println("�ýø� Ÿ�� ����");
		} else { 
			System.out.println("�ɾ��");
		}
		
		// contains
		// List �ڷ������� �ش� �������� �ִ��� �����ϴ� contains �޼ҵ尡 �ִ�.
		// contains �޼ҵ�� ���ǹ��� ���� Ȱ��Ǵµ� ��� Ȱ���� �Ǵ��� ���캸��.
		ArrayList<String> pocket = new ArrayList<>();
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("money");
		
		if(pocket.contains("money")) {
			System.out.println("�ýø� Ÿ�� ����");
		} else { 
		    System.out.println("�ɾ��");
		}
		
		// else if(���� ���� �Ǵ�)
		// if�� else�����δ� �پ��� ���� �Ǵ��� �ϱⰡ ��ƴ�.
		// ������ ���� ���� �ϴ��� if�� else�����δ� ���� �Ǵܿ� ������� �ް� �ȴ�.
		// "������ ���� ������ �ýø� Ÿ��, ������ ���� ������ 
		// ī�尡 ������ �ýø� Ÿ��, ���� ���� ī�嵵 ������ �ɾ��"
		// ���� ������ ���� ������ �Ǵ��ϴ� �κ��� �� ������ �ִ�.
		// ���� ������ ���� �ִ����� �Ǵ��ؾ� �ϰ� ������ 
		// ���� ������ �ٽ� ī�尡 �ִ����� �Ǵ��Ѵ�.
		if(pocket.contains("money")) {
			System.out.println("�ýø� Ÿ�� ����");
		} else {
			if(hashCard) {
				System.out.println("�ýø� Ÿ�� ����");
			} else {
				System.out.println("�ɾ��");
			}
		}
		// if�� else�� ������ ���Ǿ� �����ϱⰡ ���� �ʰ� 
		// �길�� ������ ���. ���� ���� ���� �����ϱ� ���ؼ�
		// �ڹٴ� ���� ���� �Ǵ��� �����ϰ� �ϴ� else if�� �ִ�.
		if(pocket.contains("money")) {
			System.out.println("�ýø� Ÿ�� ����");
		} else if(hashCard) {
			System.out.println("�ýø� Ÿ�� ����");
		} else { 
			System.out.println("�ɾ��");
		}
		// else if�� ���� ���ǹ��� ������ �� ����ȴ�.
		// ���� ������ pocket.contains("money")������
		// �����̹Ƿ� else if ���� ����ǰ� hashCard�� true�̹Ƿ� 
		// "�ýø� Ÿ�� ����"�� ���
		
		// if, else if, else�� �⺻ ����
		/*if (���ǹ�) {
		    <������ ����1> 
		    <������ ����2>
		    ...
		}else if (���ǹ�) {
		    <������ ����1>
		    <������ ����2>
		    ...
		}else if (���ǹ�) {
		    <������ ����1>
		    <������ ����2>
		    ...
		...
		} else {
		   <������ ����1>
		   <������ ����2>
		   ... 
		}*/
	}

}
