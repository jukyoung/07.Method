import java.util.Scanner;

public class Quiz03_Dictionary {
	
	public static String dict(String fru){
		// 1.  String eng ="";
		if(fru.equals("����")) {
			return "Strawberry"; // 1.  return ��� eng
		}else if(fru.equals("������")) {
			return "Peach"; //
		}else if(fru.equals("�ڸ�")) {
			return "Grapefruit"; // 
		}else {
			return "������ ��ϵ��� ���� �ܾ�"; 
		}
		// return = eng;
	}
	
    public static void main(String[] args) {
    	/* ����ڿ���
    	 * ==== ���ϴ� ������ �̸��� �Է��ϼ���. ====
    	 * >>
    	 * 
    	 * -> dict() �޼��带 �̿��ؼ� ����ڰ� �Է��� ������ ���� �ܾ�� �ٲ㼭 ��ȯ���ִ� �޼��带 ����
    	 * -> ��������� "�Է��� 00�� ����� 00 �Դϴ�."
    	 * -> 3������ ����, ������, �ڸ� �� ���� ���� �Է��ϸ� "������ ��ϵ��� ���� �ܾ�"
    	 * */
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.print("\n������ �Է��� �ּ��� >> ");
        	String fruit = sc.nextLine();
        	// 2. String eng = dict(fruit);
        	System.out.println("�Է��� " + fruit + " ��/�� ����� "+ dict(fruit) + " �Դϴ�.");
        	// 3.  eng + " �Դϴ�."
        	if(dict(fruit).equals("������ ��ϵ��� ���� �ܾ�")) {
        		System.out.println("\n���� ���α׷��� �����մϴ�.");
        		break;
        	}
    	}
    	
    	
    	
    	
    	
    	
    	
}
}
