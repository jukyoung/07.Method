import java.util.Scanner;

public class Exam02_Number {
//	public static int smaller(int a, int b) {
//		if (a < b) {
//			return a;
//		}else if (a > b) {
//			return b;
//		}else { // �� ���� ���� ���� ����
//			return 0;
//		}
//	}
	
	public static int getRanNum(int x , int y) {
		int ranNum = (int)(Math.random()*(y-x+1))+x;
		return ranNum;
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//����ڰԿ� �ּҰ� x�� �ִ밪 y�� �Է¹޾� -> getRanNum() �ּҰ�  �ִ밪 ���� ������ ������ ��ȯ�����ÿ�
		System.out.print("�ּҰ��� �Է��ϼ��� >> ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("�ִ밪�� �Է��ϼ��� >> ");
		int y = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < 20; i++) {
		 System.out.println("ranNum : " + getRanNum(x, y));
		}
	     
		/*
		 * �޼��� -> ���뼺 /���뼺 �� ����
		 * 
		 * 
		 * */
		
		
		
		
		// �� ������ �Է¹��� -> smaller() ��� �޼��带 �̿��ؼ� �� ���� �� �� ���� ���� ��ȯ ����.
		// �� ���� ���
//		System.out.print("ù ��° ���ڸ� �Է��� �ּ��� >> ");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.print("�� ��° ���ڸ� �Է��� �ּ��� >> ");
//		int num2 = Integer.parseInt(sc.nextLine());
//
//		int rs = smaller(num1, num2);
//		System.out.println("rs : " + rs);
		

	}
}
