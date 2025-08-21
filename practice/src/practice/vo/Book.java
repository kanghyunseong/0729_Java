package practice.vo;

public class Book {
	
	private String title;
	private String author;
	private String genre;
	private int totalPages;
	private int pagesRead;
	
	public Book() {}
	
	public Book(String title, String author, String genre, int totalPages, int pagesRead) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.totalPages = totalPages;
		this.pagesRead = pagesRead;
	}

	public void readMore() {
		int remaining = totalPages - pagesRead;
		if (remaining > 0) {
			int toRead = Math.min(10, remaining);
			pagesRead += toRead;
			System.out.println("📖 " + toRead + "페이지 읽었습니다!");
			if (pagesRead == totalPages) {
				System.out.println("책을 모두 다 읽으셨습니다! 대단해요!");
			}
		} else {
			System.out.println("더 이상 읽을 페이지가 없습니다.");
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getPagesRead() {
		return pagesRead;
	}

	public void setPagesRead(int pagesRead) {
		this.pagesRead = pagesRead;
	}

	public int getRemainingPages() {
		return totalPages - pagesRead;
	}

	public double getProgressRate() {
		return (pagesRead * 100.0) / totalPages;
	}

	public String info() {
		String info = "\n== 책 정보 ==" 
				+"\n== 책 정보 =="
				+ "\n제목: " + title 
				+ "\n작가: " + author 
				+ "\n장르: " + genre
				+ "\n읽은 페이지: " 
				+ pagesRead + "/" 
				+ totalPages 
				+ "\n남은 페이지: " 
				+ getRemainingPages() 
				+ "\n진도율: " + getProgressRate();

		return info;
	}
}
