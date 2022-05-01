package day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sample3 {

	public static void main(String[] args) {
		/*
		 * "���"�� ���� ��� �������� "�̸�" = "ȫ�浿", "����" = "�� �� ��ĥ"������
		 * ������ �� �ִ�. �ڹ��� ��(Map)�� �̷��� �������踦 ���� ǥ���� �� �ְ� ���ִ�
		 * �ڷ����̴�. �̰��� ���� ������ ��κ��� ���鵵 ���� �ִ� �ڷ������� 
		 * Associative array, Hash��� �Ҹ���.
		 * 
		 * ��(Map)�� ����(dictionary)�� ����ϴ�. ��, people�̶� �ܾ "���",
		 * baseball�̶�� �ܾ "�߱�"��� ���� ���յǵ��� Map�� Key�� Value�� 
		 * �� ������ ���� �ڷ����̴�.
		 * key       value
		 * people    ���
		 * baseball  �߱�
		 * 
		 *  Map�� ����Ʈ�� �迭ó�� ����������(sequential)�ش� ��� ����
		 *  ������ �ʰ� key�� ���� value�� ��´�. ��(Map)�� ���� ū Ư¡�̶��
		 *  key�� value�� ���ٴ� ���̴�. baseball�̶� �ܾ��� ���� ã�� ���ؼ�
		 *  ������ ������ ���������� ��� �˻��ϴ� ���� �ƴ϶� baseball�̶��
		 *  �ܾ �ִ� ������ ���ĺ��� ���̴�.
		 */
		
		// HashMap
		// Jump to java : 
		// Map ���� List�� ���������� �������̽��̴�. Map �������̽��� ������ 
		// Map�ڷ������� HashMap, LinkedHashMap, TreeMap���� �ִ�.
		
		// put
		// key�� value�� String ������ HashMap�� ����� ������ ���Ҵ�
		// ������ �׸񰪵��� �Է��� ����.
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "���");
		map.put("baseball", "�߱�");
		// HashMap ���� ���׸����� �̿��Ѵ�.

		// get
		// key�� �ش�Ǵ� value���� ��� ���ؼ��� ������ ���� �Ѵ�.
		System.out.println(map.get("people"));
		// getOrDefault
		// ���� key�� �ش��ϴ� value�� ���� ��쿡 get�޼ҵ带 ����ϸ� 
		// ����ó�� null�� ���ϵȴ�.
		System.out.println(map.get("java"));
		// �̶� null ��� ����Ʈ ���� ��� ���� ��쿡�� getOrDefault �޼ҵ带 ���
		System.out.println(map.getOrDefault("java", "�ڹ�"));
        
		// containsKey
		// containsKey �޼ҵ�� ��(Map)�� �ش� Ű(key)�� �ִ����� �����Ͽ� 
		// �� ������� �����Ѵ�.
		System.out.println(map.containsKey("people"));
		
		// remove 
		// remove �޼ҵ�� ��(Map)�� �׸��� �����ϴ� �޼ҵ�� key���� �ش�Ǵ�
		// ������(key, value)�� ������ �� �� value ���� �����Ѵ�.
		System.out.println(map.remove("people"));
		// "people"�� �ش�Ǵ� ������(people:���)�� ������ �� "���"�� ���
		
		// size
		// size �޼ҵ�� Map�� ������ ����
		System.out.println(map.size());
		
		// keySet
		// keySet�� ��(Map)�� ��� Key�� ��Ƽ� ����
		System.out.println(map.keySet());
		// KeySet() �޼ҵ�� Map�� ��� Key�� ��Ƽ� Set �ڷ������� ����
		// Set�ڷ����� ������ ���� List �ڷ������� �ٲپ� ����Ҽ��� �ִ�.
		List<String> keyList = new ArrayList<>(map.keySet());
		
		// LinkedHashMap�� TreeMap
		// Map�� ���� ū Ư¡�� ������ �������� �ʰ� key�� value�� 
		// �������µ� �ִ�. ������ ������ Map�� �Էµ� ������� �����͸� ��������
		// ���� ��쵵 �ְ� ���δ� �Էµ� key�� ���� ��Ʈ�� �����͸� �������� 
		// ���� ���� ���� ���̴�. �̷���쿡�� LinkedHashMap�� TreeMap��
		// ����ϴ� ���� �����ϴ�.
		// LinkedHashMap�� �Էµ� ������� �����͸� �����ϴ� Ư¡�� ������ �ִ�.
		// TreeMap�� �Էµ� key�� �������� ������ �����͸� �����ϴ� Ư¡�� ������ �ִ�.
	}

}
