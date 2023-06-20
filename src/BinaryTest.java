public class BinaryTest {
    public static void main(String[] args) {
        int a = 10;
        //float f1 = 35.6; // error ? 자바는 실수형 타입을 double(8byte)로 인식, float는 4byte이기 때문
        float f2 = 35.6f; // 접미사로 f를 명시해줘야함
        char c = 'A';
        String s = "Apple"; // == java.lang.String s = "Apple";

        // 1. 69를 10진수, 2진수, 8진수, 16진수로 출력
        int decimal = 69;
        System.out.println("decimal = " + decimal);
        int binary =0b01000101; // 0b로 시작하면 2진수로 인식
        System.out.println("binary = " + binary);
        int octal=0105; // 0로 시작하면 8진수로 인식
        System.out.println("octal = " + octal);
        int hexa = 0x45; // 0x로 시작하면 16진수로 인식
        System.out.println("hexa = " + hexa);
    }
}
