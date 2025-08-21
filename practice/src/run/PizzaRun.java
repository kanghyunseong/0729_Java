package run;

import java.util.Scanner;

import practice.vo.Pizza;

public class PizzaRun {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pizza pizza = new Pizza();

		System.out.println("피자 주문하기 🍕");

		System.out.print("피자 이름 입력 > ");
		String name = sc.nextLine();
		pizza.setName(name);

		System.out.print("사이즈 입력 (S/M/L) > ");
		String size = sc.nextLine();
		pizza.setSize(size);

		System.out.print("크러스트 종류 > ");
		String crust = sc.nextLine();
		pizza.setCrust(crust);

		System.out.print("토핑 입력 > ");
		String topping = sc.nextLine();
		pizza.setTopping(topping);

		System.out.print("조각 수 입력 > ");
		int slices = sc.nextInt();
		pizza.setSlices(slices);
		

		pizza.setHot(false);
		
		Pizza pizza2 = new Pizza(
				pizza.getName(),
				pizza.getSize(),
				pizza.getCrust(),
				pizza.getTopping(),
				pizza.getSlices(),
				pizza.getHot()
				);

		boolean exit = false;

		while (!exit) {

			System.out.print("1. 정보보기 / 2. 데우기 / 3. 종료 > ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				System.out.println(pizza2.info());
				break;
			case 2:
				pizza2.reheat();
				break;
			case 3:
				exit = true;
				break;
			default:
				System.out.println("잘못된 선택입니다.");
			}
		}
	}
}
