import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu { // 선언(정의) only. not 실행코드
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
	 * 생성자 - 일종의 메소드 용도: 주로 초기화 작업용. 명명법: 이름이 클래스와 같아야 함. 반환값: 반환값이 없다.(반환할 수 없이,
	 * 작업만 실행) 실행/호출: new연산자가 실행된 직후, 자동실행 다른 메소드/생성자를 호출할 수 있다.
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
	String getName(String menu_num) {
		return this.alName.get(Integer.parseInt(menu_num)-1);
	}
	Integer getPrice(String price) {
		return this.alPrice.get(Integer.parseInt(price)-1);
	}
	void appendMenu() {
		Scanner s=new Scanner(System.in);
		System.out.println("새로운 메뉴를 추가합니다. 새 메뉴명을 입력해 주세요");
		String n=s.nextLine();// 새메뉴명 읽기
		addName(n);// 메뉴명 추가 add name
		System.out.println("가격을 입력해 주세요");
		n=s.nextLine();	// 새가격 읽기
		addPrice(n);// 메뉴가격 추가 add price
		System.out.println("<추가완료> 'r'키로 추가된 목록확인");
	}

	void changeMenu() {
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		System.out.println("기존메뉴 수정(이름/가격) 수정할 메뉴번호를 입력해 주세요");
		int n=s1.nextInt();// 수정할 메뉴번호 읽기
		System.out.println("수정할 메뉴명을 입력해 주세요.");
		String m=s.nextLine();// 수정할 메뉴명 읽기
		System.out.println("수정할 가격을 입력해 주세요.");
		int p=s1.nextInt();// 수정할 가격 읽기
		this.alName.set(n-1, m);
		this.alPrice.set(n-1, p);
		System.out.println("<수정완료> 메뉴목록을 출력합니다.");
		showMenu();
	}
	void deleteMenu() {
		Scanner s1=new Scanner(System.in);
		System.out.println("<기존메뉴 삭제> 삭제할 메뉴번호를 입력해 주세요.");
		int t=s1.nextInt();// 삭제할 메뉴번호 읽기 
		this.alName.remove(t-1);
		this.alPrice.remove(t-1);
		System.out.println("<삭제완료> 메뉴목록을 출력합니다.");
		showMenu();
	}
	void showMenu() {
		for (int i = 0; i < this.alName.size(); i++) {
			System.out.println((i+1)+". "+this.alName.get(i) + "\t" + this.alPrice.get(i));
		}
		
	}

	void save() { // arraylist alName,alPrice를 파일(menu.txt)에 저장
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

	void load() { // 파일(menu.txt)을 읽어서 arraylist alName,alPrice에 로드.
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
