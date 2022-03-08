
public class Exam04_Overloading {
	/* overloading : 메서드가 정의됐을 때 -> 하나의 기능이 있음
	 * -> 기존에 메서드가 가지고 있는 기능에 추가적인 인자값이나 자료형의 변화를 줘서
	 *    기본적인 메서드의 형태를 다양화 할 수 있는 문법
	 *    
	 *    -> 메서드의 리턴타입(반환타입)이 같고 메서드명이 같은데
	 *    매개변수의 개수나 혹은 자료형 혹은 둘 다 다르다면 오버로딩 성립
	 *     
	 * */
	
	// 기준
	public static int plus(int num1 , int num2) {
		return num1 + num2;
	}
	// 메서드명은 같지만 매개변수의 개수가 다름 = 오버로딩
	public static int plus(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	// 메서드명은 같지만 매개변수의 자료형이 다름 = 오버로딩
	public static int plus(double num1, double num2) {
		return (int)( num1 + num2);
	}
	// 메서드명은 같지만 매겨변수의 개수와 매개변수의 자료형이 다름 = 오버로딩
	public static int plus(char char1, char char2, char char3) {
		return char1+ char2 + char3;
	}
	// 오버로딩 o -> 반환타입 같고 메서드명 같음 매개변수의 개수가 다름(0개)
	public static int plus() {
		return 5 + 10;
	}
	
	// 오버로딩이 성립이 안되는 경우
	// -> 반환 타입이 달라지게 되면 아예 다른 메서드로 인식
	// -> 하나의 클래스에는 중복된 이름의 다른 메서드가 존재해서는 안됨.
	//public static void plus(int num1, int num2){ //똑같은 이름의 중복된 메서드가 있다고 오류
		//num1 + num2; //기준이 된 메서드와 오버로딩 된 메서드 끼리 연결이 되어있기 때문에
	//}// 똑같은 이름의 다른 메서드는 절대 존재할 수 없음
	
	// 리턴자료형이 달라지고 + 매개변수의 형태도 달라지게 되면 다른 메서드로써 같은 이름을 사용하는게 가능 
	//오버로딩 아님
	public static void plus(float num1, float num2) {
		float rs = num1 + num2;
	}
	
	
    public static void main(String[] args) {
	    // 두 개의 정수를 더하는 메서드
    	System.out.println( plus(10, 5) );
    	
    	// 세 개의 char 데이터를 더하는 메서드
    	System.out.println( plus('a', 'b', 'c') );
    	
    	// 두 개의 실수를 더하는 메서드
    	System.out.println( plus(3.5, 1.5) );
    	
    	// 세 개의 정수를 더하는 메서드
    	System.out.println( plus(10, 5, 10) );
    	
    	
    	
}
}
