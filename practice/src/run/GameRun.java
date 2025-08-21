package run;

import java.util.Scanner;

import practice.vo.Game;

public class GameRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Game game = new Game();

		System.out.println("게임 등록 🎮");

		System.out.print("제목 > ");
		String title = sc.nextLine();
		game.setTitle(title);

		System.out.print("장르 > ");
		String genre = sc.nextLine();
		game.setGenre(genre);

		System.out.print("플랫폼 > ");
		String platform = sc.nextLine();
		game.setPlatform(platform);

		System.out.print("현재까지 플레이 시간(시간 단위) > ");
		int playTime = sc.nextInt();
		game.setPlayTime(playTime);

		System.out.print("평점 (1~10) > ");
		int rating = sc.nextInt();
		game.setRating(rating);

		Game game2 = new Game(
				game.getTitle(),
				game.getGenre(),
				game.getPlatform(),
				game.getPlayTime(),
				game.getRating(),
				game.getIsLife()
			);
		
		boolean exit = false;
		while (!exit) {
			
			System.out.print("1. 정보출력 / 2. 1시간 플레이 /  3. 플레이어 사망 / 4. 플레이어 부활 / 5. 종료 > ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				System.out.println(game2.info());
				break;
			case 2:
				game2.play();
				break;
			case 3:
				game2.playerDeath();
				break;
			case 4: 
				game2.playerRevival();
				break;
			case  5: 
				exit = true;
				break;
			default:
				System.out.println("다시 선택해주세요.");
			}
		}
	}
}