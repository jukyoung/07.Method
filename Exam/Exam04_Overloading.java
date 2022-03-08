
public class Exam04_Overloading {
	/* overloading : �޼��尡 ���ǵ��� �� -> �ϳ��� ����� ����
	 * -> ������ �޼��尡 ������ �ִ� ��ɿ� �߰����� ���ڰ��̳� �ڷ����� ��ȭ�� �༭
	 *    �⺻���� �޼����� ���¸� �پ�ȭ �� �� �ִ� ����
	 *    
	 *    -> �޼����� ����Ÿ��(��ȯŸ��)�� ���� �޼������ ������
	 *    �Ű������� ������ Ȥ�� �ڷ��� Ȥ�� �� �� �ٸ��ٸ� �����ε� ����
	 *     
	 * */
	
	// ����
	public static int plus(int num1 , int num2) {
		return num1 + num2;
	}
	// �޼������ ������ �Ű������� ������ �ٸ� = �����ε�
	public static int plus(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	// �޼������ ������ �Ű������� �ڷ����� �ٸ� = �����ε�
	public static int plus(double num1, double num2) {
		return (int)( num1 + num2);
	}
	// �޼������ ������ �Űܺ����� ������ �Ű������� �ڷ����� �ٸ� = �����ε�
	public static int plus(char char1, char char2, char char3) {
		return char1+ char2 + char3;
	}
	// �����ε� o -> ��ȯŸ�� ���� �޼���� ���� �Ű������� ������ �ٸ�(0��)
	public static int plus() {
		return 5 + 10;
	}
	
	// �����ε��� ������ �ȵǴ� ���
	// -> ��ȯ Ÿ���� �޶����� �Ǹ� �ƿ� �ٸ� �޼���� �ν�
	// -> �ϳ��� Ŭ�������� �ߺ��� �̸��� �ٸ� �޼��尡 �����ؼ��� �ȵ�.
	//public static void plus(int num1, int num2){ //�Ȱ��� �̸��� �ߺ��� �޼��尡 �ִٰ� ����
		//num1 + num2; //������ �� �޼���� �����ε� �� �޼��� ���� ������ �Ǿ��ֱ� ������
	//}// �Ȱ��� �̸��� �ٸ� �޼���� ���� ������ �� ����
	
	// �����ڷ����� �޶����� + �Ű������� ���µ� �޶����� �Ǹ� �ٸ� �޼���ν� ���� �̸��� ����ϴ°� ���� 
	//�����ε� �ƴ�
	public static void plus(float num1, float num2) {
		float rs = num1 + num2;
	}
	
	
    public static void main(String[] args) {
	    // �� ���� ������ ���ϴ� �޼���
    	System.out.println( plus(10, 5) );
    	
    	// �� ���� char �����͸� ���ϴ� �޼���
    	System.out.println( plus('a', 'b', 'c') );
    	
    	// �� ���� �Ǽ��� ���ϴ� �޼���
    	System.out.println( plus(3.5, 1.5) );
    	
    	// �� ���� ������ ���ϴ� �޼���
    	System.out.println( plus(10, 5, 10) );
    	
    	
    	
}
}
