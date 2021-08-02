import java.util.ArrayList;

public class Menu { // 선언(정의) only. not 실행코드 
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
	/* 생성자 - 일종의 메소드
	 *         용도: 주로 초기화 작업용. 
	           명명법: 이름이 클래스와 같아야 함.
	           반환값: 반환값이 없다.(반환할 수 없이, 작업만 실행)
	           실행/호출: new연산자가 실행된 직후, 자동실행
	           다른 메소드/생성자를 호출할 수 있다.
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
