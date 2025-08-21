package run;

import java.util.Scanner;

import practice.vo.*;

public class CatRun {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cat cat = new Cat();

        System.out.println("고양이 등록 🐱");

        System.out.print("이름 > ");
        String name = sc.nextLine();
        cat.setName(name);

        System.out.print("품종 > ");
        String breed = sc.nextLine();
        cat.setBreed(breed);

        System.out.print("나이 > ");
        int age = sc.nextInt();
        cat.setAge(age);
        sc.nextLine();

        System.out.print("색상 > ");
        String color = sc.nextLine();
        cat.setColor(color);

        System.out.print("몸무게(kg) > ");
        int weight = sc.nextInt();
        cat.setWeight(weight);
        sc.nextLine();

        Cat cat2 = new Cat(
				cat.getName(), 
				cat.getBreed(), 
				cat.getAge(), 
				cat.getColor(), 
				cat.getWeight(),
				cat.isSleeping(),
		        cat.getMood(),
		        cat.getEatCount()
			);
        
        
        boolean exit = false;
        while (!exit) {

            System.out.print("\n1. 정보보기 / 2. 야옹 울리기 / 3. 밥 먹이기 / 4. 살빼기 / 5. 잠자기 / 6. 깨우기 / 7. 종료 > ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
            	case 1:
            		System.out.println(cat2.info());
            		break;
                case 2:
                    cat2.meow();
                    break;
                case 3:
                    cat2.eatCat();
                    break;
                case 4:
                    cat2.diet();
                    break;
                case 5:
                    cat2.sleep();
                    break;
                case 6:
                    cat2.wakeUp();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("잘못 입력!");
            }
        }

        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }
}
