import java.util.*;
public class ScannerTest {

    // 키보드 == (스트림, 통로, 빨대) ==> 자바
    // 1. 입력스트림  : System.in(인풋스트림)
    // 2. 출력스트림
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int num = scan.nextInt(); // 블럭상태
        System.out.println("num = " + num);

        System.out.println("실수를 입력하세요");
        float f = scan.nextFloat();
        System.out.println("f = " + f);

        System.out.println("문자열를 입력하세요");
        String str = scan.next(); // 공백이 있을 경우 공백앞까지 가져옴
        System.out.println("str = " +str);

        // 위의 next()는 공백 앞까지만 가져오기 때문에 스트림(통로)에는 아직 공백 뒤의 문자열과 enter가 남아있다
        // 남은 문자와 enter가 아래의 nextLine()과 만나면 의도치 않게 남아있는 문자가 출력되어버리므로 버퍼 비우기
        scan.nextLine();

        System.out.println("문자열를 입력하세요");
        String str2 = scan.nextLine(); // 문자열 한줄을 가져옴
        System.out.println("str2 = " +str2);

        scan.close();
    }
}
