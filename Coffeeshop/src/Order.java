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
		this.alMenu.add(name);// 주문메뉴명 추가
		this.alPrice.add(price);// 주문 가격 추가
		this.alCount.add(cnt);// 주문수량 추가
		this.alTotal.add(price*cnt);// 합계계산 + 추가 + 반환
		// 이게 alTotal이라는 합계값을 모아두는 배열리스트로 들어감.
		
		return price*cnt;
		
	}
	int getTotalSum() {
		int sum = 0; //for문 바깥에서.. 범위중요.
		for(int i=0; i<alTotal.size();i++){
		sum = sum + alTotal.get(i); // 주문리스트의 총액을 더해서 반환
		}
		return sum;
	}
	void addMobile(String Mobile) {
		this.alMobile.add(Mobile);
	}
	
}
