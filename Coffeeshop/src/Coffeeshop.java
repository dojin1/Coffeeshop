import java.util.ArrayList;
import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		Menu menu=new Menu();
		//menu.showMenu();
		Scanner s=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
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
						System.out.println("새로운 메뉴를 추가합니다. 새 메뉴명을 입력해 주세요");
						n=s.nextLine();// 새메뉴명 읽기
						menu.addName(n);// 메뉴명 추가 add name
						System.out.println("가격을 입력해 주세요");
						n=s.nextLine();	// 새가격 읽기
						menu.addPrice(n);// 메뉴가격 추가 add price
						System.out.println("<추가완료> 'r'키로 추가된 목록확인");
					}else if(n.equals("r") || n.equals("R")) { // "r":목록보기 출력
						menu.showMenu();// 메뉴목록보기.
						System.out.println("메뉴작업을 선택하세요.(c:추가,r:목록보기,u:수정,d:삭제,q:메뉴관리 종료)");
					}else if(n.equals("u") || n.equals("U")) { // "u":기존메뉴 수정(이름/가격) 수정출력
						System.out.println("기존메뉴 수정(이름/가격) 수정할 메뉴번호를 입력해 주세요");
						int a=sc.nextInt();// 수정할 메뉴번호 읽기
						System.out.println("수정할 메뉴명을 입력해 주세요.");
						n=s.nextLine();// 수정할 메뉴명 읽기
						System.out.println("수정할 가격을 입력해 주세요.");
						int c=sc.nextInt();// 수정할 가격 읽기
						menu.changeMenu(a, n, c);// 메뉴번호에 해당하는 메뉴명&가격 수정
						System.out.println("<수정완료> 메뉴목록을 출력합니다.");
						menu.showMenu();
						System.out.println("메뉴작업을 선택하세요.(c:추가,r:목록보기,u:수정,d:삭제,q:메뉴관리 종료)");
					}else if(n.equals("d") || n.equals("D")) { // "d":기존메뉴 삭제 삭제출력
						System.out.println("<기존메뉴 삭제> 삭제할 메뉴번호를 입력해 주세요.");
						int t=sc.nextInt();// 삭제할 메뉴번호 읽기 
						menu.deleteMenu(t);// 메뉴 삭제
						System.out.println("<삭제완료> 메뉴목록을 출력합니다.");
						menu.showMenu();
					}else if(n.equals("Q")) {
						break;
					}else {
						System.out.println("다시 입력해 주세요");
					}
					n=s.nextLine();
				}
				System.out.println("메뉴관리 종료");
					System.out.println("<단축키를 입력해 주세요.> m:메뉴관리,o:주문받기,s:실적받기, 'x'또는'X' 입력시 프로그램 종료"); // 메뉴작업을 선택하시오(...) 출력
			}else if(n.equals("o") || n.equals("O")) { // o: 주문
				System.out.println("주문받기");
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
