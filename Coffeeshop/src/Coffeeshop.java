import java.util.ArrayList;
import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		Menu menu=new Menu();
		//menu.showMenu();
		Scanner s=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.println("<����Ű�� �Է��� �ּ���.> m:�޴�����,o:�ֹ��ޱ�,s:�����ޱ�, 'x'�Ǵ�'X' �Է½� ���α׷� ����");
		String n=s.nextLine();
		while(!n.equals("x")) {
			if(n.equals("m") || n.equals("M")) { // m: �޴�����
				System.out.println("�޴�����");
				menu.showMenu();
				// CRUD(�߰�/��ȸ/����/����)
				System.out.println("�޴��۾��� �����ϼ���.(c:�߰�,r:��Ϻ���,u:����,d:����,q:�޴����� ����)");
				n=s.nextLine();	
				while(!n.equals("q")) { // "q"�� �ƴ� ����
					if(n.equals("c") || n.equals("C")) { // "c":���޴��߰� �۾� ���
						System.out.println("���ο� �޴��� �߰��մϴ�. �� �޴����� �Է��� �ּ���");
						n=s.nextLine();// ���޴��� �б�
						menu.addName(n);// �޴��� �߰� add name
						System.out.println("������ �Է��� �ּ���");
						n=s.nextLine();	// ������ �б�
						menu.addPrice(n);// �޴����� �߰� add price
						System.out.println("<�߰��Ϸ�> 'r'Ű�� �߰��� ���Ȯ��");
					}else if(n.equals("r") || n.equals("R")) { // "r":��Ϻ��� ���
						menu.showMenu();// �޴���Ϻ���.
						System.out.println("�޴��۾��� �����ϼ���.(c:�߰�,r:��Ϻ���,u:����,d:����,q:�޴����� ����)");
					}else if(n.equals("u") || n.equals("U")) { // "u":�����޴� ����(�̸�/����) �������
						System.out.println("�����޴� ����(�̸�/����) ������ �޴���ȣ�� �Է��� �ּ���");
						int a=sc.nextInt();// ������ �޴���ȣ �б�
						System.out.println("������ �޴����� �Է��� �ּ���.");
						n=s.nextLine();// ������ �޴��� �б�
						System.out.println("������ ������ �Է��� �ּ���.");
						int c=sc.nextInt();// ������ ���� �б�
						menu.changeMenu(a, n, c);// �޴���ȣ�� �ش��ϴ� �޴���&���� ����
						System.out.println("<�����Ϸ�> �޴������ ����մϴ�.");
						menu.showMenu();
						System.out.println("�޴��۾��� �����ϼ���.(c:�߰�,r:��Ϻ���,u:����,d:����,q:�޴����� ����)");
					}else if(n.equals("d") || n.equals("D")) { // "d":�����޴� ���� �������
						System.out.println("<�����޴� ����> ������ �޴���ȣ�� �Է��� �ּ���.");
						int t=sc.nextInt();// ������ �޴���ȣ �б� 
						menu.deleteMenu(t);// �޴� ����
						System.out.println("<�����Ϸ�> �޴������ ����մϴ�.");
						menu.showMenu();
					}else if(n.equals("Q")) {
						break;
					}else {
						System.out.println("�ٽ� �Է��� �ּ���");
					}
					n=s.nextLine();
				}
				System.out.println("�޴����� ����");
					System.out.println("<����Ű�� �Է��� �ּ���.> m:�޴�����,o:�ֹ��ޱ�,s:�����ޱ�, 'x'�Ǵ�'X' �Է½� ���α׷� ����"); // �޴��۾��� �����Ͻÿ�(...) ���
			}else if(n.equals("o") || n.equals("O")) { // o: �ֹ�
				System.out.println("�ֹ��ޱ�");
			}else if(n.equals("s") || n.equals("S")) { // s: ��������
				System.out.println("�����ޱ�"); 
			}else if(n.equals("X")) { // x: ���α׷� ����.
				break;
			}else {
				System.out.println("�ٽ� �Է��� �ּ���");
			}
			n=s.nextLine(); 	// ������ �д´�.
		}
			menu.save();
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
