package day4;

/* �� ���� �ڹ����Ͽ� 2�� �̻��� Ŭ���� �����ϱ�
 * Sample3.java ��� ���� ���� Sample, Updater, Counter��� 
 * Ŭ������ 3���� �����ߴ�. �̰��� ���� Ư�������� ���� ������ �ڵ��̴�.
 * �ϳ��� java���ϳ����� �������� Ŭ������ ������ �� �ִ�. �� ���ϸ���
 * Sample3.java��� Sample3.java���� Sample3 Ŭ������ 
 * public���� �����϶�� ����(��Ģ)�� �ִ�.
 */
class Updater {
	void update(Counter counter) {
        counter.count++;
    }
}

class Counter { 
	int count = 0; // ��ü����
}


public class Sample3 {

	public static void main(String[] args) {
		// Call by value
		/* �޼ҵ忡 ��(primitive type)�� �����ϴ� �Ͱ�
		 * ��ü(reference type)�� �����ϴ� �Ϳ��� ū ���̰� �ִ�.
		 * �̰��� �ſ� �߿��ϱ� ������ ������ ��� ��������� �ٽ��ѹ� �ڼ��� �˾ƺ���.
		 * ��к��� ����Ѵٸ� �޼ҵ忡 ��ü�� ������ ��� �޼ҵ忡��
		 * ��ü�� ��ü����(�Ӽ�)���� ������ �� �ִ�.
		 * 
		 * ������ ������ ����.
		 */
		Counter myCounter = new Counter();
		System.out.println("before update : " + myCounter.count);
		Updater myUpdater = new Updater();
		myUpdater.update(myCounter);
		System.out.println("after update : " + myCounter.count);
		/* Update Ŭ������ ���޹��� ���ڸ� 1��ŭ ������Ű�� 
		 * update��� �޼ҵ带 ������ �ִ�. Counter Ŭ������ 
		 * count��� ��ü������ ������ �ִ�. SampleŬ������ main
		 * �޼ҵ�� CounterŬ������ ���� ������ ��ü�� ��ü���� 
		 * count�� ���� UpdaterŬ������ �̿��Ͽ� ������Ű���� 
		 * �õ��ϴ� �����̴�.
		 * 
		 * ������ �����غ��� ������ ���� ��� ���� ���´�.
		 * => console Ȯ��
		 * 
		 * ��ü ���� count�� ���� update�޼ҵ忡 �Ѱܼ� �����Ű���� 
		 * ���� ��ȭ�� ����. �� ������ ���� é�Ϳ��� �˾ƺ� �Ͱ� ����
		 * update �޼ҵ�� ��(int �ڷ���)�� ���޹޾ұ� �����̴�.
		 * 
		 * ���� ������ ������ ���� ���� �� ����.
		 * (�����ϱ� ��)
		 * class Updater {
			    void update(int count) {
			        count++;
			    }
			}
			
			class Counter {
			    int count = 0;  // ��ü����
			}
			
			public class Sample {
			    public static void main(String[] args) {
			        Counter myCounter = new Counter();
			        System.out.println("before update:"+myCounter.count);
			        Updater myUpdater = new Updater();
			        myUpdater.update(myCounter.count);
			        System.out.println("after update:"+myCounter.count);
			    }
			}
			���� �������� �������� update �޼ҵ��� �Է��׸��̴�.
			�������� int count�� ���� ���� ���޹޾Ҵٸ� ������
			Counter counter�� ���� ��ü�� ���޹޵��� ������ ���̴�.
			
			update �޼ҵ带 ȣ���ϴ� �κе� ����ó�� �ٲ����.
			myUpdater.update(myCounter);
			
			���� ����� Ŭ������ ���� �� ���� ������ ���� ����� ��µȴ�.
			(���� �ڵ�� �ֿܼ��� Ȯ��)
			
			myCounter ��ü�� count ���� 1��ŭ �����Ǿ���.
			�̷��� �޼ҵ��� �Է����� ��ü�� ���޹޴� ��쿡�� 
			�޼ҵ尡 �Է¹��� ��ü�� �״�� ����ϱ� ������ �޼ҵ尡
			��ü�� �Ӽ����� �����ϸ� �޼ҵ� ���� �Ŀ��� ��ü�� �����
			�Ӽ����� �����ȴ�.
		 */
		

	}

}
