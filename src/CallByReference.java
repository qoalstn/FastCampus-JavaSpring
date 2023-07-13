public class CallByReference {
    public static void main(String[] args) {

        // 1. call by value
        float a = 56.7f;
        float b = 78.9f;
        float result = floatAdd(a, b);
        System.out.println("result = " + result);

        // 2. call by reference
        int[] arr = {1,2,3,4,5};
        int resultArr = addArray(arr);
        System.out.println("resultArr = " + resultArr);
    }
    public static float floatAdd(float a, float b){
        float hap = a+b;
        System.out.println("hap = " + hap);
        return hap;
    }

    // Q. 매개변수로 정수형 배열을 받아서 배열의 총합을 구하여 리턴 하는 메서드를 정의 하세요
    public static int addArray(int[] a){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
