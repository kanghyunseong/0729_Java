package run;

import java.util.Scanner;

import practice.vo.Book;

public class BookRun {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        Book book = new Book();

        System.out.println("책 등록 📚");

        System.out.print("제목 > ");
        String title = sc.nextLine();
        book.setTitle(title);
        
        System.out.print("작가 > ");
        String author = sc.nextLine();
        book.setAuthor(author);
        
        System.out.print("장르 > ");
        String genre = sc.nextLine();
        book.setGenre(genre);
        
        System.out.print("전체 페이지 수 > ");
        int totalPage = sc.nextInt();
        book.setTotalPages(totalPage);
        
        System.out.print("현재 읽은 페이지 수 > ");
        int pagesRead = sc.nextInt();
        book.setPagesRead(pagesRead);
        
        sc.nextLine();

        boolean exit = false;
        
        Book book2 = new Book(
        				book.getTitle(), 
        				book.getAuthor(), 
        				book.getGenre(), 
        				book.getTotalPages(), 
        				book.getPagesRead()
        			);
        
        while (!exit) {
            System.out.print("\n1. 10페이지 읽기 / 2. 책 정보 보기 / 3. 종료 > ");
            int menu = sc.nextInt(); 
            sc.nextLine();

            switch (menu) {
                case 1:
                    book2.readMore();
                    break;
                case 2 :
                	book2.info();
                	System.out.println(book2.info());
                	break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("잘못 입력!");
            }
        }

        System.out.println("📕 프로그램을 종료합니다.");
    }
}
