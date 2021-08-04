import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu { // ����(����) only. not �����ڵ�
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;

	
	  Menu() {
		  alName=new ArrayList<String>(); 
		  alPrice=new ArrayList<Integer>();
		  this.load();
	  
			/*
			 * addName("Americano"); addName("Espresso"); addName("Latte"); addPrice(2000);
			 * addPrice(2500); addPrice(3000);
			 * 
			 * showMenu();
			 */
	  
	  }
	 
	
	  
	/*
	 * ������ - ������ �޼ҵ� �뵵: �ַ� �ʱ�ȭ �۾���. ����: �̸��� Ŭ������ ���ƾ� ��. ��ȯ��: ��ȯ���� ����.(��ȯ�� �� ����,
	 * �۾��� ����) ����/ȣ��: new�����ڰ� ����� ����, �ڵ����� �ٸ� �޼ҵ�/�����ڸ� ȣ���� �� �ִ�.
	 */
	void addName(String name) {
		this.alName.add(name);
	}

	void addPrice(int price) {
		this.alPrice.add(price);
	}
	void addPrice(String price) {
		this.alPrice.add(Integer.parseInt(price));
	}
	String getName(String menu_num) {
		return this.alName.get(Integer.parseInt(menu_num)-1);
	}
	Integer getPrice(String price) {
		return this.alPrice.get(Integer.parseInt(price)-1);
	}
	void appendMenu() {
		Scanner s=new Scanner(System.in);
		System.out.println("���ο� �޴��� �߰��մϴ�. �� �޴����� �Է��� �ּ���");
		String n=s.nextLine();// ���޴��� �б�
		addName(n);// �޴��� �߰� add name
		System.out.println("������ �Է��� �ּ���");
		n=s.nextLine();	// ������ �б�
		addPrice(n);// �޴����� �߰� add price
		System.out.println("<�߰��Ϸ�> 'r'Ű�� �߰��� ���Ȯ��");
	}

	void changeMenu() {
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		System.out.println("�����޴� ����(�̸�/����) ������ �޴���ȣ�� �Է��� �ּ���");
		int n=s1.nextInt();// ������ �޴���ȣ �б�
		System.out.println("������ �޴����� �Է��� �ּ���.");
		String m=s.nextLine();// ������ �޴��� �б�
		System.out.println("������ ������ �Է��� �ּ���.");
		int p=s1.nextInt();// ������ ���� �б�
		this.alName.set(n-1, m);
		this.alPrice.set(n-1, p);
		System.out.println("<�����Ϸ�> �޴������ ����մϴ�.");
		showMenu();
	}
	void deleteMenu() {
		Scanner s1=new Scanner(System.in);
		System.out.println("<�����޴� ����> ������ �޴���ȣ�� �Է��� �ּ���.");
		int t=s1.nextInt();// ������ �޴���ȣ �б� 
		this.alName.remove(t-1);
		this.alPrice.remove(t-1);
		System.out.println("<�����Ϸ�> �޴������ ����մϴ�.");
		showMenu();
	}
	void showMenu() {
		for (int i = 0; i < this.alName.size(); i++) {
			System.out.println((i+1)+". "+this.alName.get(i) + "\t" + this.alPrice.get(i));
		}
		
	}

	void save() { // arraylist alName,alPrice�� ����(menu.txt)�� ����
		File file=new File("c:/temp/menu.txt");
		if(file.exists()) {
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(file));
				for(int i=0;i<this.alName.size();i++) {
					String line = this.alName.get(i)+","+this.alPrice.get(i);
					writer.write(line);
					if((i+1)!=this.alName.size())
						writer.write("\r\n");
				}
				writer.flush();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	void load() { // ����(menu.txt)�� �о arraylist alName,alPrice�� �ε�.
		File file = new File("c:/temp/menu.txt");
		if (file.exists()) {
			BufferedReader inFile = null;
			try {
				inFile = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String line;
			try {
				line = inFile.readLine();
				while (line != null) {
					String[] parts = line.split(",");
					addName(parts[0]);
					addPrice(parts[1]);
					line = inFile.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
