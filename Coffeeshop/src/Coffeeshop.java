import java.util.ArrayList;
import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		Menu menu=new Menu();
		//menu.showMenu();
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
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
						menu.appendMenu();
					}else if(n.equals("r") || n.equals("R")) { // "r":��Ϻ��� ���
						menu.showMenu();// �޴���Ϻ���.
						System.out.println("�޴��۾��� �����ϼ���.(c:�߰�,r:��Ϻ���,u:����,d:����,q:�޴����� ����)");
					}else if(n.equals("u") || n.equals("U")) { // "u":�����޴� ����(�̸�/����) �������
						menu.changeMenu();
						System.out.println("�޴��۾��� �����ϼ���.(c:�߰�,r:��Ϻ���,u:����,d:����,q:�޴����� ����)");
					}else if(n.equals("d") || n.equals("D")) { // "d":�����޴� ���� �������
						menu.deleteMenu();
					}else if(n.equals("Q")) {
						break;
					}else {
						System.out.println("�ٽ� �Է��� �ּ���");
					}
					n=s.nextLine();
				}
				menu.save();
				System.out.println("�޴����� ����");
				System.out.println("<����Ű�� �Է��� �ּ���.> m:�޴�����,o:�ֹ��ޱ�,s:�����ޱ�, 'x'�Ǵ�'X' �Է½� ���α׷� ����"); // �޴��۾��� �����Ͻÿ�(...) ���
			}else if(n.equals("o") || n.equals("O")) { // o: �ֹ�
				menu.showMenu();
				Order order = new Order();
				System.out.println("�ֹ��� �޽��ϴ�. �޴���ȣ�� �����ϼ���.");// ��� "�޴���ȣ�� �����ϼ���"
				n=s.nextLine();// ���� �д´�.
				while(!n.equals("=")){ // �޴���ȣ�� ""�� �ƴѵ���
					System.out.println("������ �Է��ϼ���"); // "������ �Է��ϼ���" ���
					int c=s1.nextInt(); // ���� �д´�.
					String mn = menu.getName(n);// �޴���ȣ�� �޴����� ã�Ƴ���.
					int p = menu.getPrice(n);// �޴���ȣ�� �޴������� ã�Ƴ���.
					int total =	order.addOrder(mn,p,c);// �ֹ��� order�� �߰�.(order.addOrder(�޴���,����,����)
					System.out.println("�Ѿ�:"+" "+total);// ��ȯ�� �޾Ƽ� �Ѿ����
					// menu.showMenu();
					System.out.println("");
					System.out.println("�޴���ȣ�� �����ϼ���.'='�Է½� �ջ�");// "�޴���ȣ�� �����ϼ���" ���
					n=s.nextLine();// ���� �д´�.
			}
				System.out.println("<������ �ջ��մϴ�.> (�޴����� ����)");
				int totalSum = order.getTotalSum();
				System.out.println("��ü�Ѿ�:"+" "+totalSum);// ���޴��� �Ѿ��� ���� ��ü�Ѿ��� ���(getTotalSum())
				System.out.println("");
				System.out.println("����Ϲ�ȣ�� �Է��ϼ���(����)");// "����Ϲ�ȣ�� �Է��ϼ���" ���
				n=s.nextLine();// ���� ����Ϲ�ȣ �Է¹޴´�.
				order.addMobile(n);
				System.out.println("��ȣ:"+" "+ n);
				// ������ �߰��Ѵ�.(���߿�)
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
