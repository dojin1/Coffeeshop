import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		Menu menu=new Menu();
		menu.load();
		/*
		 * Scanner s1 = new Scanner(System.in); Scanner s2 = new Scanner(System.in);
		 * 
		 * System.out.println("�޴��� �Է�:"); String name=s1.nextLine();
		 * while(!name.equals("")) { //�� ���ڿ� �Է�. System.out.println("�����Է�:"); int price
		 * = s2.nextInt(); menu.addName(name); menu.addPrice(price);
		 * System.out.println("�޴��� �Է�:"); name=s1.nextLine(); }
		 * System.out.println("�޴����");
		 */
		menu.showMenu();
		/* s1.close(); s2.close(); */
	}
}
