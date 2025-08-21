package practice.vo;

public class Game {

	private String title;
	private String genre;
	private String platform;
	private int playTime;
	private int rating;

	private boolean life = true;

	public Game() {

	}

	public Game(String title, String genre, String platform, int playTime, int rating, boolean life) {
		this.title = title;
		this.genre = genre;
		this.platform = platform;
		this.playTime = playTime;
		this.rating = rating;
		this.life = life;
	}

	public void play() {
		if (life) {
			playTime += 1;
			System.out.println(title + "을(를) 1시간 플레이했습니다!");
		} else {
			System.out.println("플레이어가 사망 상태입니다. 부활 후 다시 플레이해주세요.");
		}
	}

	public void playerDeath() {
		if (!life) {
			System.out.println("이미 사망한 상태입니다.");
		} else {
			life = false;
			System.out.println("플레이어가 사망하셨습니다.");
		}
	}

	public void playerRevival() {
		if (life) {
			System.out.println("이미 살아있는 상태입니다.");
		} else {
			life = true;
			System.out.println("플레이어가 부활하셨습니다.");
		}
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}
	
	public boolean getIsLife() {
	    return life;
	}

	public void setLife(boolean life) {
	    this.life = life;
	}

	public String info() {
		String info = "\n== 게임 정보 ==\n" + "제목: " + title + "\n" + "장르: " + genre + "\n" + "플랫폼: " + platform + "\n"
				+ "플레이 시간: " + playTime + "시간\n" + "평점: " + rating + "/10\n" + "플레이어 상태: " + (life ? "생존" : "사망")
				+ "\n";

		return info;
	}
}
