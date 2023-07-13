package fc.java.part3;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("책 제목");
        String title = scan.nextLine();

        System.out.println("가격");
        int price = scan.nextInt();

        scan.nextLine();

        System.out.println("출판사");
        String company = scan.nextLine();

        BookDTO book = new BookDTO();
        book.title = title;
        book.price = price;
        book.company = company;

        // 1. static메소드 사용
        bookInfoPrint(book); // call by reference (value가 아닌 번지를 호출한다)

        // 2. util 클래스 사용
        BookUtil bookUtil = new BookUtil();
        bookUtil.bookInfoPrintByUtil(book);
    }

    // Q. 매개변수로 책의 정보를 받아서 출력하는 메소드를 정의
    public static void bookInfoPrint(BookDTO book){
        System.out.println("title = " + book.title + "price = " + book.price + "company = " + book.company);
    }
}
