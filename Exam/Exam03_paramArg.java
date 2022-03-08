
public class Exam03_paramArg {

	public static char getA() {
		return 'A';
	}
	// void : 리턴값이 없는 경우 메서드 정의부에 적어주는 특수한 리턴타입
	public static void greeting() {
		System.out.println("안녕하세요?");
	}

	public static void main(String[] args) {
    	/*// getA() A라고 하는 값을 반환받고 싶음 -> 매개변수나 인자값이 필요없는 상황
    	 * 매개변수 인자값은 반드시 있어야 하는게 아님 -> 필수 x
    	 * */
    	
		System.out.println(getA());
		
		/* 리턴값이 없을 수도 있음
		 * */
		
		greeting();
		
		
	}
}
