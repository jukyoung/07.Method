import java.util.Scanner;

public class Exam02_Number {
//	public static int smaller(int a, int b) {
//		if (a < b) {
//			return a;
//		}else if (a > b) {
//			return b;
//		}else { // 두 수가 같을 수도 있음
//			return 0;
//		}
//	}
	
	public static int getRanNum(int x , int y) {
		int ranNum = (int)(Math.random()*(y-x+1))+x;
		return ranNum;
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//사용자게에 최소값 x와 최대값 y를 입력받아 -> getRanNum() 최소값  최대값 범위 사이의 난수를 반환받으시오
		System.out.print("최소값을 입력하세요 >> ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.print("최대값을 입력하세요 >> ");
		int y = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < 20; i++) {
		 System.out.println("ranNum : " + getRanNum(x, y));
		}
	     
		/*
		 * 메서드 -> 재사용성 /범용성 이 좋다
		 * 
		 * 
		 * */
		
		
		
		
		// 두 정수를 입력받음 -> smaller() 라는 메서드를 이용해서 두 정수 중 더 작은 수를 반환 받음.
		// 그 수를 출력
//		System.out.print("첫 번째 숫자를 입력해 주세요 >> ");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.print("두 번째 숫자를 입력해 주세요 >> ");
//		int num2 = Integer.parseInt(sc.nextLine());
//
//		int rs = smaller(num1, num2);
//		System.out.println("rs : " + rs);
		

	}
}
