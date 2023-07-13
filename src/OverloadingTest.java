public class OverloadingTest {
    public static void main(String[] args) {
        //add 메소드의 이름은 같지만 매개변수의 타입이 달라 오버로딩이 가능

        float floatV = add(35.6f, 56.7f);
        System.out.println("v = " + floatV);
        
        int intV = add(12,34);
        System.out.println("intV = " + intV);
    }
    //Q. 매개변수로 두개의 정수 값을 받아서 총합을 구하여 리턴 하는 메서드를 정의 하세요
    public static int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    
    // Q. 매개변수로 두개의 실수 값을 받아서 총합을 구하여 리턴 하는 메서드를 정의 하세요.
    public static float add(float a, float b){
        float sum=a+b;
        return sum;
    }

}
