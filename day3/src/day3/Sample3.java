package day3;

public class Sample3 {

	public static void main(String[] args) {
		// ���� ����
		// Q1. ��°�� �����ϱ�
		String a = "write once, run anywhere";
		if(a.contains("wife")) {
			System.out.println("wife");
		} else if(a.contains("once") && !a.contains("run")) {
			System.out.println("once");
		} else if(!a.contains("everywhere")) {
			System.out.println("everywhere");
		} else if(a.contains("anywhere")) {
			System.out.println("anywhere");
		} else {
			System.out.println("none");
		} // ��� ����� �����ϱ�?(������ �ؼ��ϰ� ���߱�)

		// Q2. while���� ����� 1���� 1000������ �ڿ��� �� 3�� ����� ���� ���� ����.
		int b = 1;
		int sum = 0;
		while(1<=b && b<=1000) {
			if(b%3==0) {
				sum += b;
			} 
			b++;
		}
		System.out.println(sum);
		
		// Q3. while�� �Ǵ� for���� ����Ͽ� ������ ���� ��(*)�� ǥ���ϴ� ���α׷��� �ۼ��غ���.
		for(int i = 0; i<5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q4 .for���� ����� 1���� 100������ ���ڸ� ����غ���.
		for(int i =1; i <= 100; i++) {
			System.out.println(i);
		}
		
		// Q5 .A�б޿� �� 10���� �л��� �ִ�. �� �л����� �߰���� ������ ������ ����.
		int[] marks = {70, 60, 55, 75, 95, 90, 80, 85, 100};
		// for each���� ����Ͽ� A�б��� ��� ������ ���غ���.
		int sum2 = 0;
		for(int mark : marks) {
			sum2 += mark;
		}
		int aver = sum2/marks.length;
		System.out.println(aver);
	}

}
