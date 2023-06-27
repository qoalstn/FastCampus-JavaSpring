public class BookExam {
    public static void main(String[] args) {
        // Q. 한권의 책 데이터를 저장하기 위해 객체를 생성(인스턴스 생성)
        Book b = new Book();
        b.title = "자바 교과서";
        b.author = "누구누구";
        b.price = 20000;
        b.page = 300;
        b.company = "한빛";
        System.out.println(b.title+"\t"+b.author+"\t"+b.price+"\t"+b.page+"\t"+b.company);
    }
}
