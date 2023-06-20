public class VDAtest {
    public static void main(String[] args) {
        // 1. 정수 한개를 저장하기 위해 변수 v를 선언
        int v; // 변수선언 -> 기억공간
        v=10;
        System.out.println("v = " + v);

        // 2. 변수 a에 10을 저장하고 a에 저장된 값을 변수 b에 저장하고 변수 b에 10을 곱하여 변수 c에 저장
        int a = 10;
        int b = a;
        int c = b * 10;
        System.out.println("c = " + c);

        // 3. sum이라는 변수에 1부터 5000까지의 수를 누적(accumulate)해서 출력
        int sum=0; // 지역변수는 반드시 초기화를 하여 사용해야한다(쓰레기값이 들어가므로)
        sum=sum+1;
        sum=sum+2;
        sum=sum+3;
        sum=sum+4;
        sum=sum+5;
        System.out.println("sum = " + sum);

        // 4. x=10, y=20을 저장하고 변수의 값을 서로 교환하여 출력
        int x = 10;
        int y = 20;
        int tmp;
        tmp = y;
        y = x;
        x = tmp;
        System.out.println("x="+x+":"+"y="+y);

        



    }
}
