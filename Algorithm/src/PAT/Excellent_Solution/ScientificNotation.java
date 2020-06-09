package PAT.Excellent_Solution;


import java.math.BigDecimal;
        import java.util.Scanner;

public class ScientificNotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal s = sc.nextBigDecimal();
        System.out.println(s.toPlainString());
    }
}
