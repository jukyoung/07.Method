import java.util.Scanner;

public class Quiz04_Customer {
	
	public static void getCustomer(String name){
	System.out.println(name + "�� �ȳ��ϼ���!");	
	}
	public static void getCustomer(int count) {
		if(count == 1) {
			System.out.println("ȥ��մ� �Դϴ�.");
		}else {
			System.out.println("�մ� "+count + "�� �����Ͽ����ϴ�.");
		}
	}
	public static void getCustomer(float temp) {
		if(temp >= 36.5 && temp <= 37) {
			System.out.println("���� ü���Դϴ�.");
		}else if(temp < 36.5 ) {
			System.out.println("��ü�� �Դϴ�.");
		}else {
			System.out.println("���� �Ұ� �մϴ�.");
		}
	}
	public static void getCustomer(boolean meal) {
		if(meal == true) {
			System.out.println("���� �մ��Դϴ�.");
		}else if(meal == false) {
			System.out.println("���� �մ��Դϴ�.");
		}
	}
	
   public static void main(String[] args) {
	
	   /*
	    * 4���� �޴��� ����ִ� ���α׷�
	    * ++ 4 ���� �޼��� ��� getCustomer() ��� �̸��� �޼���� �����ε��� ����
	    * 1. ����ڰ� �̸��� �Է��ϸ� '~�� �ȳ��ϼ���!'�� ����ϴ� �޼��� ����
	    * 2. ����ڰ� �ο���(����)�� �Է��ϸ� '�մ� ~�� �����Ͽ����ϴ�.' ��� 1���̸� 'ȥ��մ��Դϴ�' ����ϴ� �޼���
	    * 3. ����ڰ� ü��(�Ǽ�)�� �Է��ϸ� '���� ������ �մ��� ü���� ~�� �Դϴ�.' ���
	    *  + 36.5��~37�� ���̸� ����ü��, �̸��̸� ��ü��, �ʰ��� ����Ұ� ������ִ� �޼���
	    *  4. ����ڰ� true�� �Է��ϸ� '����մ��Դϴ�.' ��� / false '���� �մ��Դϴ�.' ����ϴ� �޼���
	    * 
	    * */
	   
	   
	   Scanner sc = new Scanner(System.in);
	   while(true) {
	   System.out.println("=== �մ� ���� ���α׷� ===");
	   System.out.print("1. �̸��� �Է��� �ּ��� >> ");
	   String name = sc.nextLine();
	   getCustomer(name);
	   
	   System.out.print("\n2. �ο����� �Է��� �ּ��� >> ");
	   int count = Integer.parseInt(sc.nextLine());
	   getCustomer(count);
	   
	   System.out.print("\n3. ���� ü���� �Է��� �ּ���. >> ");
	   float temp = Float.parseFloat(sc.nextLine());
	   getCustomer(temp);
	   if(temp>37) {
		   break;
	   }
	   
	   System.out.print("\n4. ���� �Ļ� ���θ� �Է��� �ּ��� >> ");
	   boolean meal =Boolean.parseBoolean(sc.nextLine());
	   getCustomer(meal);
	   break;
	   }
	   
	   System.out.println("\n�ֹ��� �Ϸ��Ͽ����ϴ�. �����մϴ�.");
}
}
