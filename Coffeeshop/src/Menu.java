import java.util.ArrayList;

public class Menu { // ����(����) only. not �����ڵ� 
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	Menu() {
		alName=new ArrayList<String>();
		alPrice=new ArrayList<Integer>();
		
		addName("Americano");
		addName("Espresso");
		addName("Latte");
		addPrice(2000);
		addPrice(2500);
		addPrice(3000);
		
		showMenu();
	}
	/* ������ - ������ �޼ҵ�
	 *         �뵵: �ַ� �ʱ�ȭ �۾���. 
	           ����: �̸��� Ŭ������ ���ƾ� ��.
	           ��ȯ��: ��ȯ���� ����.(��ȯ�� �� ����, �۾��� ����)
	           ����/ȣ��: new�����ڰ� ����� ����, �ڵ�����
	           �ٸ� �޼ҵ�/�����ڸ� ȣ���� �� �ִ�.
	*/
	void addName(String name) {
		this.alName.add(name);
	}
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	void showMenu() {
		for(int i=0;i<this.alName.size();i++) {
			System.out.println(this.alName.get(i)+"\t"+this.alPrice.get(i));
		}
	}
}
