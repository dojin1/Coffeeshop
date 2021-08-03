import java.util.ArrayList;
import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		Menu menu=new Menu();
		//menu.showMenu();
		
		// m: 메뉴관리
		// o: 주문
		// s: 실적보기
		// x: 프로그램 종료.
		Scanner s=new Scanner(System.in);
		System.out.println("<단축키를 입력해 주세요.> m:메뉴관리,o:주문받기,s:실적받기, 'x'또는'X' 입력시 프로그램 종료");
		String n=s.nextLine();
		while(!n.equals("x")) {
			if(n.equals("m") || n.equals("M")) {
				System.out.println("메뉴관리");
				menu.showMenu();
				// CRUD(추가/조회/수정/삭제)
				System.out.println("메뉴작업을 선택하시오.(c:추가,r:목록보기,u:수정,d:삭제,q:메뉴관리 종료)");
				n=s.nextLine();
				// "q"가 아닌 동안
				// "c":새메뉴추가 작업 출력
				// "r":목록보기 출력
				// "u":기존메뉴 수정(이름/가격) 수정출력
				// "d":기존메뉴 삭제 삭제출력
				// 메뉴작업을 선택하시오(...) 출력
				// 새값을 읽는다.
				while(!n.equals("q")) {
					if(n.equals("c") || n.equals("C")) {
						System.out.println("새 메뉴 추가작업");
					}else if(n.equals("r") || n.equals("R")) {
						System.out.println("목록보기");
					}else if(n.equals("u") || n.equals("U")) {
						System.out.println("기존메뉴 수정(이름/가격)");
					}else if(n.equals("d") || n.equals("D")) {
						System.out.println("기존메뉴 삭제");
					}else if(n.equals("Q")) {
						break;
					}else {
						System.out.println("다시 입력해 주세요");
					}
					n=s.nextLine();
				}
					System.out.println("메뉴관리 종료");
					System.out.println("작업을 선택해 주세요.");
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
