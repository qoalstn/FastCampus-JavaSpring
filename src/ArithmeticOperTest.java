public class ArithmeticOperTest {
    public static void main(String[] args) {
        // Q. 나누기와 나머지 연산자의 활용
        int digit = 3625;
        System.out.println(digit%10);
        System.out.println(digit%10%10);
        System.out.println(digit%100%10);
        System.out.println(digit%1000%10);




        // Q. 짝수와 홀수 구분
        int num =5;
        if(num%2==0){
            System.out.println("짝수입니다");
        }else{
            System.out.println("홀수입니다");
        }
    }
}
