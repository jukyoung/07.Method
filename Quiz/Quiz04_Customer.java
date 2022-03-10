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
	public static void getCustomer(double temp) {
		System.out.println("현재 온도는 " + temp +"도 입니다.");
		if(temp >= 36.5 && temp <= 37) {
			System.out.println("정상 체온입니다.");
		}else if(temp < 36.5 ) {
			System.out.println("저체온 입니다.");
		}else {
			System.out.println("입장 불가 합니다.");
		}
	}
	public static void getCustomer(boolean meal) {
		if(meal) { //변수 안에 true 라는 값이 들어있기때문에 meal == true 비교 할 필 요 없음
			System.out.println("매장 손님입니다.");
		}else {
			System.out.println("포장 손님입니다.");
		}
	}
	/*  ㄱ. 출력구문은 메서드 안에 넣는건 자제하기! -> 사용자가 보는 화면이 콘솔이 아니라 웹브라우저로 바뀌게 되면 
	 *   System.out.println는 수정을 해줘야함 -> 유지보수 면에서 굉장히 비효율적
	 * 
	 public static String getCustomer(String name){
	  return name + "님 안녕하세요!";
                  }
	public static String getCustomer(int count) {
	 if(count == 1) {
		 return "혼밥손님 입니다.";
	}else {
		return "손님 "+count + "명 입장하였습니다.";
	      }
    }
    
    public static String getCustomer(double temp) {
		if(temp >= 36.5 && temp <= 37) {
			return"정상 체온입니다.";
		}else if(temp < 36.5 ) {
			return "저체온 입니다.";
		}else { -> else if 를 쓰면 3가지 경우가 모두 false 일 경우 가 있어서 
		          또 다른 return 문을 넣어줘야하기 때문에 else 쓰기
			return "체온이 너무 높습니다.";
		}
	}
	public static String getCustomer(boolean meal) {
		if(meal) { 
			return "매장 손님입니다.";
		}else {
			return "포장 손님입니다.";
		}
	}
	
	
	 
	 */  
	
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
	  //ㄱ. System.out.println(getCustomer(name));
	   
	   System.out.print("\n2. 인원수를 입력해 주세요 >> ");
	   int count = Integer.parseInt(sc.nextLine());
	   getCustomer(count);
	// ㄱ. System.out.println(getCustomer(count));
	   
	   System.out.print("\n3. 현재 체온을 입력해 주세요. >> ");
	   double temp = Double.parseDouble(sc.nextLine());
	   getCustomer(temp);
	   //ㄱ.System.out.println("현재 온도는 " + temp +"도 입니다.");
	   //ㄱ. System.out.println(getCustomer(temp));
	   if(temp>37) {
		   break;
	   }
	   
	   System.out.print("\n4. 매장 식사 여부를 입력해 주세요 >> ");
	   boolean meal =Boolean.parseBoolean(sc.nextLine());
	   getCustomer(meal);
	 //ㄱ. System.out.println(getCustomer(meal));
	   break;
	   }
	   
	   System.out.println("\n주문을 완료하였습니다. 감사합니다.");
}
}
