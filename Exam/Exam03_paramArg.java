
public class Exam03_paramArg {

	public static char getA() {
		return 'A';
	}
	// void : ���ϰ��� ���� ��� �޼��� ���Ǻο� �����ִ� Ư���� ����Ÿ��
	public static void greeting() {
		System.out.println("�ȳ��ϼ���?");
	}

	public static void main(String[] args) {
    	/*// getA() A��� �ϴ� ���� ��ȯ�ް� ���� -> �Ű������� ���ڰ��� �ʿ���� ��Ȳ
    	 * �Ű����� ���ڰ��� �ݵ�� �־�� �ϴ°� �ƴ� -> �ʼ� x
    	 * */
    	
		System.out.println(getA());
		
		/* ���ϰ��� ���� ���� ����
		 * */
		
		greeting();
		
		
	}
}
