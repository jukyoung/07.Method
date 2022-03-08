import java.util.Scanner;

public class Quiz04_Customer {
	
	public static void getCustomer(String name){
	System.out.println(name + "님 안녕하세요!");	
	}
	public static void getCustomer(int count) {
		if(count == 1) {
			System.out.println("혼밥손님 입니다.");
		}else {
			System.out.println("손님 "+count + "명 입장하였습니다.");
		}
	}
	public static void getCustomer(float temp) {
		if(temp >= 36.5 && temp <= 37) {
			System.out.println("정상 체온입니다.");
		}else if(temp < 36.5 ) {
			System.out.println("저체온 입니다.");
		}else {
			System.out.println("입장 불가 합니다.");
		}
	}
	public static void getCustomer(boolean meal) {
		if(meal == true) {
			System.out.println("매장 손님입니다.");
		}else if(meal == false) {
			System.out.println("포장 손님입니다.");
		}
	}
	
   public static void main(String[] args) {
	
	   /*
	    * 4가지 메뉴를 띄워주는 프로그램
	    * ++ 4 가지 메서드 모두 getCustomer() 라는 이름의 메서드로 오버로딩을 적용
	    * 1. 사용자가 이름을 입력하면 '~님 안녕하세요!'를 출력하는 메서드 실행
	    * 2. 사용자가 인원수(정수)를 입력하면 '손님 ~명 입장하였습니다.' 출력 1명이면 '혼밥손님입니다' 출력하는 메서드
	    * 3. 사용자가 체온(실수)을 입력하면 '현재 입장한 손님의 체온은 ~도 입니다.' 출력
	    *  + 36.5도~37도 사이면 정상체온, 미만이면 저체온, 초과면 입장불가 출력해주는 메서드
	    *  4. 사용자가 true를 입력하면 '매장손님입니다.' 출력 / false '포장 손님입니다.' 출력하는 메서드
	    * 
	    * */
	   
	   
	   Scanner sc = new Scanner(System.in);
	   while(true) {
	   System.out.println("=== 손님 맞이 프로그램 ===");
	   System.out.print("1. 이름을 입력해 주세요 >> ");
	   String name = sc.nextLine();
	   getCustomer(name);
	   
	   System.out.print("\n2. 인원수를 입력해 주세요 >> ");
	   int count = Integer.parseInt(sc.nextLine());
	   getCustomer(count);
	   
	   System.out.print("\n3. 현재 체온을 입력해 주세요. >> ");
	   float temp = Float.parseFloat(sc.nextLine());
	   getCustomer(temp);
	   if(temp>37) {
		   break;
	   }
	   
	   System.out.print("\n4. 매장 식사 여부를 입력해 주세요 >> ");
	   boolean meal =Boolean.parseBoolean(sc.nextLine());
	   getCustomer(meal);
	   break;
	   }
	   
	   System.out.println("\n주문을 완료하였습니다. 감사합니다.");
}
}
