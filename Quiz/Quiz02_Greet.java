import java.util.Scanner;

public class Quiz02_Greet {

	public static void greeting(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("�ȳ��ϼ���!");
		}
	}

	public static void main(String[] args) {

		// ����ڿ��� �Է¹��� ������ŭ '�ȳ��ϼ���!'�� ������ִ� �޼���
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� >> ");
		int num = Integer.parseInt(sc.nextLine());

		greeting(num);

	}
}
