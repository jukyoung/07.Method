import java.util.Scanner;

public class Quiz02_Greet {

	public static void greeting(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("안녕하세요!");
		}
	}

	public static void main(String[] args) {

		// 사용자에게 입력받은 정수만큼 '안녕하세요!'를 출력해주는 메서드
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 >> ");
		int num = Integer.parseInt(sc.nextLine());

		greeting(num);

	}
}
