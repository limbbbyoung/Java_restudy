package day2;

public class Sample5 {

	public static void main(String[] args) {
		// switch/case��
		// switch/case���� if���� ��������� �� �� ����ȭ�� ���� �Ǵܹ�
		/* switch(�Էº���) {
		 *     case �Է°�1: ...
		 *          break;
		 *     case �Է°�2: ...
		 *          break;
		 *     ...
		 *     default: ...
		 *          break;
		 *     }
		 * �Էº����� ���� ��ġ�ϴ� case�Է°�(�Է°�1, �Է°�2, ..)�� �ִٸ�
		 * �ش� case���� ���� ������� ����ȴ�.case������ break��� 
		 * ������ �ִµ� �ش� case���� ���� �� �� switch���� 
		 * ���������� ���� ���̴�. ���� break���� ���� �ִٸ� �״����� case���� ����ȴ�.
		 */
		
		int month = 8;
		String monthString = "";
		switch(month) {
		case 1 : monthString = "January";
		         	break;
		case 2 : monthString = "February";
					break;
		case 3 : monthString = "March";
					break;
		case 4 : monthString = "April";
					break;
		case 5 : monthString = "May";
					break;
		case 6 : monthString = "June";
					break;
		case 7 : monthString = "July";
					break;
		case 8 : monthString = "August";
					break;
		case 9 : monthString = "September";
					break;
		case 10 : monthString = "October";
					break;
		case 11 : monthString = "November";
					break;
		case 12 : monthString = "Decenber";
					break;
		default : monthString = "Invaild month";
					break;
		         
		}
		System.out.println(monthString);
		// ���� ���� �Է°��� ����ȭ�Ǿ� �ִ� ��� if�����ٴ� Switch/case����
		// ���� ���� ���������� �� �� �����ϴ�.
	}

}
