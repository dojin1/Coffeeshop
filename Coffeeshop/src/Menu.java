import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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
	void changeMenu(int menu_num,String name,int price) {
		this.alName.set(menu_num-1, name);
		this.alPrice.set(menu_num-1, price);
	}
	void deleteMenu(int menu_num) {
		this.alName.remove(menu_num-1);
		this.alPrice.remove(menu_num-1);
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
