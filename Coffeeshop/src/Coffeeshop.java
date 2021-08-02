import java.util.ArrayList;
import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		Menu menu=new Menu();
		//menu.showMenu();
		
		// m: 메뉴관리
		// o: 주문받기
		// s: 실적받기
		// x: 프로그램 종료.
		Scanner s=new Scanner(System.in);
		System.out.println("<단축키를 입력해 주세요.> 'x'또는'X' 입력시 프로그램 종료");
		String n=s.nextLine();
		while(!n.equals("x")) {
			if(n.equals("m") || n.equals("M")) {
				System.out.println("메뉴관리");
			}else if(n.equals("o") || n.equals("O")) {
				System.out.println("주문받기");
			}else if(n.equals("s") || n.equals("S")) {
				System.out.println("실적받기");
			}else if(n.equals("X")) {
				break;
			}else {
				System.out.println("다시 입력해 주세요");
			}
			n=s.nextLine();
		}
			System.out.println("프로그램 종료");
		//menu.load();
		/*
		 * Scanner s1 = new Scanner(System.in); Scanner s2 = new Scanner(System.in);
		 * 
		 * System.out.println("메뉴명 입력:"); String name=s1.nextLine();
		 * while(!name.equals("")) { //빈 문자열 입력. System.out.println("가격입력:"); int price
		 * = s2.nextInt(); menu.addName(name); menu.addPrice(price);
		 * System.out.println("메뉴명 입력:"); name=s1.nextLine(); }
		 * System.out.println("메뉴목록");
		 */
		/* s1.close(); s2.close(); */
	}
}
