public class MethodMakeTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int result = add(a,b); // static메소드에서는 static메소드만 호출이 가능
        System.out.println("result = " + result);
    }
    // Q. 매개변수로 2개의 정수를 받아서 총합을 구하여 리턴 하는 메서드를 정의하세요.(MethodMakeTest.java)
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
}
