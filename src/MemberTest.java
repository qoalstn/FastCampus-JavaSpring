public class MemberTest {
    public static void main(String[] args) {
        // Q. 한 명의 헬스클럼 [회원] 데이터를 저장하고 출력
        Member m = new Member();
        m.name = "홍길동";
        m.age = 30;
        m.tel="101-0000-0000";
        m.email = "email@mail.com";
        m.weight = 57.7f;
        m.addr = "서울";
        System.out.println(m.name+"\t"+m.age+"\t"+m.tel+"\t"+m.email+"\t"+m.weight+"\t"+m.addr);
    }
}
