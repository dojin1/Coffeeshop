import java.util.ArrayList;
import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		Menu menu=new Menu();
		//menu.showMenu();
		
		// m: �޴�����
		// o: �ֹ��ޱ�
		// s: �����ޱ�
		// x: ���α׷� ����.
		Scanner s=new Scanner(System.in);
		System.out.println("<����Ű�� �Է��� �ּ���.> 'x'�Ǵ�'X' �Է½� ���α׷� ����");
		String n=s.nextLine();
		while(!n.equals("x")) {
			if(n.equals("m") || n.equals("M")) {
				System.out.println("�޴�����");
			}else if(n.equals("o") || n.equals("O")) {
				System.out.println("�ֹ��ޱ�");
			}else if(n.equals("s") || n.equals("S")) {
				System.out.println("�����ޱ�");
			}else if(n.equals("X")) {
				break;
			}else {
				System.out.println("�ٽ� �Է��� �ּ���");
			}
			n=s.nextLine();
		}
			System.out.println("���α׷� ����");
		//menu.load();
		/*
		 * Scanner s1 = new Scanner(System.in); Scanner s2 = new Scanner(System.in);
		 * 
		 * System.out.println("�޴��� �Է�:"); String name=s1.nextLine();
		 * while(!name.equals("")) { //�� ���ڿ� �Է�. System.out.println("�����Է�:"); int price
		 * = s2.nextInt(); menu.addName(name); menu.addPrice(price);
		 * System.out.println("�޴��� �Է�:"); name=s1.nextLine(); }
		 * System.out.println("�޴����");
		 */
		/* s1.close(); s2.close(); */
	}
}
