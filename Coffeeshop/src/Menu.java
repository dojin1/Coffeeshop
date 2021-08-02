import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Menu { // ����(����) only. not �����ڵ�
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;

	/*
	 * Menu() { alName=new ArrayList<String>(); alPrice=new ArrayList<Integer>();
	 * this.load();
	 * 
	 * addName("Americano"); addName("Espresso"); addName("Latte"); addPrice(2000);
	 * addPrice(2500); addPrice(3000);
	 * 
	 * showMenu();
	 * 
	 * }
	 */
	
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

	void showMenu() {
		for (int i = 0; i < this.alName.size(); i++) {
			System.out.println(this.alName.get(i) + "\t" + this.alPrice.get(i));
		}
	}

	void save() { // arraylist alName,alPrice�� ����(menu.txt)�� ����

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
