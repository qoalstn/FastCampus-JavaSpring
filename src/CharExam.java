public class CharExam {
    public static void main(String[] args) {
        // Q. ‘1’+’2’+’3’+’4’+’5’=15이 나오도록 프로그래밍 하시요.
        int sum = 0;
        sum = sum + ('1'-48);
        sum = sum + ('2'-48);
        sum = sum + ('3'-48);
        sum = sum + ('4'-48);
        sum = sum + ('5'-48);
        System.out.println("sum = " + sum);

    }
}
