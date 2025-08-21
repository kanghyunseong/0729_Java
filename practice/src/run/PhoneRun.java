package run;

import java.util.Scanner;
import practice.vo.Phone;

public class PhoneRun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone phone = new Phone();

        System.out.println("스마트폰 등록");
        System.out.println("--------------------");

        System.out.print("브랜드를 입력해주세요 ! > ");
        String brand = sc.nextLine();
        phone.setBrand(brand);
        
        System.out.print("모델 입력 > ");
        String model = sc.nextLine();
        phone.setModel(model);

        System.out.print("색상 입력 > ");
        String color = sc.nextLine();
        phone.setColor(color);

        System.out.print("운영체제 입력 > ");
        String os = sc.nextLine();
        phone.setOs(os);

        System.out.print("현재 배터리(%) 입력 > ");
        int battery = sc.nextInt();
        sc.nextLine();
        
        phone.setBattery(battery);
        phone.setOn(false);

        
        phone.setOn(false);
        
        Phone phone2 = new Phone(
        	    phone.getBrand(),
        	    phone.getModel(),
        	    phone.getColor(),
        	    phone.getBattery(),
        	    phone.getIsOn(),
        	    phone.getOs()
        	);

        boolean exit = false;
        while (!exit) {

            System.out.print("\n1. 정보 보기 / 2. 충전하기 / 3. 사용하기 / 4. 전원 켜기 / 5. 전원 끄기 / 6. 종료하기 > ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
            	case 1:
            		System.out.println(phone2.info());
            		break;
                case 2:
                    phone2.charge();
                    break;
                case 3:
                    phone2.usedPhone();
                    break;
                case 4:
                    phone2.powerOn();
                    break;
                case 5:
                    phone2.powerOff();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("다시 선택해주세요.");
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
