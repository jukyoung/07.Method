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
	public static void getCustomer(double temp) {
		System.out.println("���� �µ��� " + temp +"�� �Դϴ�.");
		if(temp >= 36.5 && temp <= 37) {
			System.out.println("���� ü���Դϴ�.");
		}else if(temp < 36.5 ) {
			System.out.println("��ü�� �Դϴ�.");
		}else {
			System.out.println("���� �Ұ� �մϴ�.");
		}
	}
	public static void getCustomer(boolean meal) {
		if(meal) { //���� �ȿ� true ��� ���� ����ֱ⶧���� meal == true �� �� �� �� ����
			System.out.println("���� �մ��Դϴ�.");
		}else {
			System.out.println("���� �մ��Դϴ�.");
		}
	}
	/*  ��. ��±����� �޼��� �ȿ� �ִ°� �����ϱ�! -> ����ڰ� ���� ȭ���� �ܼ��� �ƴ϶� ���������� �ٲ�� �Ǹ� 
	 *   System.out.println�� ������ ������� -> �������� �鿡�� ������ ��ȿ����
	 * 
	 public static String getCustomer(String name){
	  return name + "�� �ȳ��ϼ���!";
                  }
	public static String getCustomer(int count) {
	 if(count == 1) {
		 return "ȥ��մ� �Դϴ�.";
	}else {
		return "�մ� "+count + "�� �����Ͽ����ϴ�.";
	      }
    }
    
    public static String getCustomer(double temp) {
		if(temp >= 36.5 && temp <= 37) {
			return"���� ü���Դϴ�.";
		}else if(temp < 36.5 ) {
			return "��ü�� �Դϴ�.";
		}else { -> else if �� ���� 3���� ��찡 ��� false �� ��� �� �־ 
		          �� �ٸ� return ���� �־�����ϱ� ������ else ����
			return "ü���� �ʹ� �����ϴ�.";
		}
	}
	public static String getCustomer(boolean meal) {
		if(meal) { 
			return "���� �մ��Դϴ�.";
		}else {
			return "���� �մ��Դϴ�.";
		}
	}
	
	
	 
	 */  
	
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
	  //��. System.out.println(getCustomer(name));
	   
	   System.out.print("\n2. �ο����� �Է��� �ּ��� >> ");
	   int count = Integer.parseInt(sc.nextLine());
	   getCustomer(count);
	// ��. System.out.println(getCustomer(count));
	   
	   System.out.print("\n3. ���� ü���� �Է��� �ּ���. >> ");
	   double temp = Double.parseDouble(sc.nextLine());
	   getCustomer(temp);
	   //��.System.out.println("���� �µ��� " + temp +"�� �Դϴ�.");
	   //��. System.out.println(getCustomer(temp));
	   if(temp>37) {
		   break;
	   }
	   
	   System.out.print("\n4. ���� �Ļ� ���θ� �Է��� �ּ��� >> ");
	   boolean meal =Boolean.parseBoolean(sc.nextLine());
	   getCustomer(meal);
	 //��. System.out.println(getCustomer(meal));
	   break;
	   }
	   
	   System.out.println("\n�ֹ��� �Ϸ��Ͽ����ϴ�. �����մϴ�.");
}
}
