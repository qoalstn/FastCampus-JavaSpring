public class CharTest {
    public static void main(String[] args) {
        // Q. 아스키코드 표를 참고하여 문자를 핸들링
        char carA='A';
        System.out.println("carA = " + carA); // A
        int a = 'A';
        System.out.println("a = " + a); // 65
        int b = 'A'+1;
        System.out.println("b = " + b); // 66
        System.out.println("b = " + (char)b); // B
        
        // Q. ‘가’라는 한글 한 문자를 변수에 저장하고 출력하시오.
        char han='가';
        System.out.println("han = " + han);
        int hanD= '가';
        System.out.println("hanD = " + hanD);
        int hanU='\uAC00';
        System.out.println("hanU = " + hanU);

        // Q. 대문자 ‘A’를 문자 ‘a’로 변환하여 출력하시요.(ASCII코드 참고)
        char upper ='A';
        char lower = (char)(upper+32); // 소문자와 대문자는 아스키코드에서 32차이
        System.out.println("lower = " + lower);

        char lower1 = 'u'; // 117
        int upper1 = lower1-32; //85
        System.out.println("upper1 = " + upper1); // 85
        System.out.println("upper1 = " + (char)upper1); // U


        // Q. ‘1’+’2’=3이 나오도록 프로그래밍 하시요.
        // 0의 아스키코드는 48
        char one = '1'; // 49-48=1
        char two = '2'; // 50-48=2
        int sum = (one-48) + (two-48);
        System.out.println("sum = " + sum);

    }
}
