package com.kh.variable;

// 1절. import절을 작성해서 어떤 패키지에 존재하는 클래스를 사용할 것인지 선언!
import java.util.Scanner;

public class B_KeyboardInput {

	/*
	 * 키보드를 이용해서 사용자에게 값을 입력받을 예정
	 * 자바에서 제공해주는 Scanner라는 클래스를 사용합시다! 
	 */
	
	public void inputTest() {
		
		// 2절. 클래스의 별칭을 지어주면서 new(생성?)를 해줌!
//		Scanner sc = new Scanner(System.in);
		// System.in : 표준 입력 도구에서 입력받은 값들을 받곘다.(바이트 단위)
//		String str = sc.nextLine();
//		
//		System.out.println(str);
		
		// 원섬후레이스
		// 사용자에게 주문할 음료를 입력받아서 출력해보자!
		
//		Scanner menu = new Scanner(System.in);
//		
//		System.out.println("----- 메뉴판 -------");
//		System.out.println("1. 한교동 갈릭쉬림프 프레첼(1800)");
//		System.out.println("2. 요거 젤리 소다 플랫치노(3900)");
//		System.out.println("3. 케로케로케로피 멜론라떼(4200)");
//		System.out.println("-------------------");
//		System.out.println("선택하실 메뉴를 입력해주세요. ");
//		
//		String input = menu.nextLine().trim();
//		
//		System.out.println("몇 개 주문하시겠습니까?(숫자로 입력해주세요)");
//		
//		int number = menu.nextInt();
//		menu.nextLine();
//		
//		System.out.println("어느 주소로 배달해드릴까요? 주소를 입력해주세요.");
//		
//		String address = menu.nextLine();
//		
//		String selectMenu = "";
//		int price = 0;
//		int cup = 0;
//		String selectAddress = "";
//		
//		if (input.equals("한교동 갈릭쉬림프 프레첼")) {
//			selectMenu = input;
//			price = 1800;
//			cup = number;
//			selectAddress = address;
//		}
//		else if(input.equals("요거 젤리 소다 플랫치노")) {
//			selectMenu = input;
//			price = 3900;
//			cup = number;
//			selectAddress = address;
//		}
//		else if(input.equals("케로케로케로피 멜론라떼")) {
//			selectMenu = input;
//			price = 4200;
//			cup = number;
//			selectAddress = address;
//			
//		} else {
//			System.out.println("입력하신 메뉴가 정확하지 않습니다.");
//			menu.close();
//			return;
//		}
//		
//		int total = price * number;
//		
//		System.out.println("======주문확인======");
//		System.out.println("주문하신 메뉴 : " + selectMenu + "입니다.");
//		System.out.println("주문하신 잔 수 : " + cup + "잔 입니다.");
//		System.out.println("주문하신 메뉴의 총 금액 : " + total + "원 입니다.");
//		System.out.println("배달할 위치의 주소 : " + selectAddress + "입니다. ");
//		System.out.println("==================");
//		
//		System.out.println("선택한 메뉴는: " + selectMenu + " / 가격은: " + total + "원입니다." + "주문하신 개수는 :" + number + "잔 입니다." + "입력하신 주소는 : " + address + "입니다.");
//		menu.close();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- 메뉴판 -------");
		System.out.println("1. 한교동 갈릭쉬림프 프레첼(1800)");
		System.out.println("2. 요거 젤리 소다 플랫치노(3900)");
		System.out.println("3. 케로케로케로피 멜론라떼(4200)");
		System.out.println("-------------------");
		System.out.print("선택하실 메뉴를 입력해주세요.  > ");
		
		String menu = sc.nextLine();
		
		System.out.println(menu + "(을)를 주문하셨습니다.");
		
		System.out.print("주문하실 잔 수  > ");
		
		int cup = sc.nextInt();
		
		System.out.println(cup + "잔을 주문하셨습니다. ");
	}
}
