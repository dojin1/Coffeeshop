import java.util.ArrayList;

public class Order {
	ArrayList<String> alMobile;
	ArrayList<String> alMenu;
	ArrayList<Integer> alCount;
	ArrayList<Integer> alTotal;
	ArrayList<Integer> alPrice;
	
	Order(){
		this.alMobile=new ArrayList<String>();
		this.alMenu=new ArrayList<String>();
		this.alCount=new ArrayList<Integer>();
		this.alTotal=new ArrayList<Integer>();
		this.alPrice=new ArrayList<Integer>();
	}
	int addOrder(String name, int price, int cnt) {
		this.alMenu.add(name);// �ֹ��޴��� �߰�
		this.alPrice.add(price);// �ֹ� ���� �߰�
		this.alCount.add(cnt);// �ֹ����� �߰�
		this.alTotal.add(price*cnt);// �հ��� + �߰� + ��ȯ
		// �̰� alTotal�̶�� �հ谪�� ��Ƶδ� �迭����Ʈ�� ��.
		
		return price*cnt;
		
	}
	int getTotalSum() {
		int sum = 0; //for�� �ٱ�����.. �����߿�.
		for(int i=0; i<alTotal.size();i++){
		sum = sum + alTotal.get(i); // �ֹ�����Ʈ�� �Ѿ��� ���ؼ� ��ȯ
		}
		return sum;
	}
	void addMobile(String Mobile) {
		this.alMobile.add(Mobile);
	}
	
}
