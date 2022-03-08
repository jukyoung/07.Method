import java.util.Scanner;

public class Quiz03_Dictionary {
	
	public static String dict(String fru){
		// 1.  String eng ="";
		if(fru.equals("딸기")) {
			return "Strawberry"; // 1.  return 대신 eng
		}else if(fru.equals("복숭아")) {
			return "Peach"; //
		}else if(fru.equals("자몽")) {
			return "Grapefruit"; // 
		}else {
			return "사전에 등록되지 않은 단어"; 
		}
		// return = eng;
	}
	
    public static void main(String[] args) {
    	/* 사용자에게
    	 * ==== 원하는 과일의 이름을 입력하세요. ====
    	 * >>
    	 * 
    	 * -> dict() 메서드를 이용해서 사용자가 입력한 과일을 영어 단어로 바꿔서 반환해주는 메서드를 구성
    	 * -> 사용자한테 "입력한 00은 영어로 00 입니다."
    	 * -> 3가지만 딸기, 복숭아, 자몽 그 외의 값을 입력하면 "사전에 등록되지 않은 단어"
    	 * */
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.print("\n과일을 입력해 주세요 >> ");
        	String fruit = sc.nextLine();
        	// 2. String eng = dict(fruit);
        	System.out.println("입력한 " + fruit + " 은/는 영어로 "+ dict(fruit) + " 입니다.");
        	// 3.  eng + " 입니다."
        	if(dict(fruit).equals("사전에 등록되지 않은 단어")) {
        		System.out.println("\n사전 프로그램을 종료합니다.");
        		break;
        	}
    	}
    	
    	
    	
    	
    	
    	
    	
}
}
