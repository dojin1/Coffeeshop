import java.util.ArrayList;
import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		Menu menu=new Menu();
		//menu.showMenu();
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		System.out.println("<단축키를 입력해 주세요.> m:메뉴관리,o:주문받기,s:실적받기, 'x'또는'X' 입력시 프로그램 종료");
		String n=s.nextLine();
		while(!n.equals("x")) {
			if(n.equals("m") || n.equals("M")) { // m: 메뉴관리
				System.out.println("메뉴관리");
				menu.showMenu();
				// CRUD(추가/조회/수정/삭제)
				System.out.println("메뉴작업을 선택하세요.(c:추가,r:목록보기,u:수정,d:삭제,q:메뉴관리 종료)");
				n=s.nextLine();	
				while(!n.equals("q")) { // "q"가 아닌 동안
					if(n.equals("c") || n.equals("C")) { // "c":새메뉴추가 작업 출력
						menu.appendMenu();
					}else if(n.equals("r") || n.equals("R")) { // "r":목록보기 출력
						menu.showMenu();// 메뉴목록보기.
						System.out.println("메뉴작업을 선택하세요.(c:추가,r:목록보기,u:수정,d:삭제,q:메뉴관리 종료)");
					}else if(n.equals("u") || n.equals("U")) { // "u":기존메뉴 수정(이름/가격) 수정출력
						menu.changeMenu();
						System.out.println("메뉴작업을 선택하세요.(c:추가,r:목록보기,u:수정,d:삭제,q:메뉴관리 종료)");
					}else if(n.equals("d") || n.equals("D")) { // "d":기존메뉴 삭제 삭제출력
						menu.deleteMenu();
					}else if(n.equals("Q")) {
						break;
					}else {
						System.out.println("다시 입력해 주세요");
					}
					n=s.nextLine();
				}
				menu.save();
				System.out.println("메뉴관리 종료");
				System.out.println("<단축키를 입력해 주세요.> m:메뉴관리,o:주문받기,s:실적받기, 'x'또는'X' 입력시 프로그램 종료"); // 메뉴작업을 선택하시오(...) 출력
			}else if(n.equals("o") || n.equals("O")) { // o: 주문
				menu.showMenu();
				Order order = new Order();
				System.out.println("주문을 받습니다. 메뉴번호를 선택하세요.");// 출력 "메뉴번호를 선택하세요"
				n=s.nextLine();// 값을 읽는다.
				while(!n.equals("=")){ // 메뉴번호가 ""이 아닌동안
					System.out.println("수량을 입력하세요"); // "수량을 입력하세요" 출력
					int c=s1.nextInt(); // 값을 읽는다.
					String mn = menu.getName(n);// 메뉴번호로 메뉴명을 찾아낸다.
					int p = menu.getPrice(n);// 메뉴번호로 메뉴가격을 찾아낸다.
					int total =	order.addOrder(mn,p,c);// 주문을 order에 추가.(order.addOrder(메뉴명,가격,수량)
					System.out.println("총액:"+" "+total);// 반환값 받아서 총액출력
					// menu.showMenu();
					System.out.println("");
					System.out.println("메뉴번호를 선택하세요.'='입력시 합산");// "메뉴번호를 선택하세요" 출력
					n=s.nextLine();// 값을 읽는다.
			}
				System.out.println("<가격을 합산합니다.> (메뉴선택 종료)");
				int totalSum = order.getTotalSum();
				System.out.println("전체총액:"+" "+totalSum);// 각메뉴의 총액을 더한 전체총액을 출력(getTotalSum())
				System.out.println("");
				System.out.println("모바일번호를 입력하세요(적립)");// "모바일번호를 입력하세요" 출력
				n=s.nextLine();// 고객의 모바일번호 입력받는다.
				order.addMobile(n);
				System.out.println("번호:"+" "+ n);
				// 실적에 추가한다.(나중에)
			}else if(n.equals("s") || n.equals("S")) { // s: 실적보기
				System.out.println("실적받기"); 
			}else if(n.equals("X")) { // x: 프로그램 종료.
				break;
			}else {
				System.out.println("다시 입력해 주세요");
			}
			n=s.nextLine(); 	// 새값을 읽는다.
		}
			menu.save();
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
