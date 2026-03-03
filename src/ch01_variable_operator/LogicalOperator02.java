package ch01_variable_operator;

import java.time.LocalDate;

public class LogicalOperator02 {
    static void main(String[] args) {
        int x = 10, y = 20;

        int t = x > y ? x < 7 ? 3 : 5 : y > 7 ? 3 : 5;

        System.out.println("t = "+t);

        String result = x % 2 == 0 ? "짝수":"홀수";
        System.out.println("result = "+result);

        x = 6;
        t = x % 3 == 0 ? (int)Math.pow(x,2) : x+5;
        System.out.println("t = "+t);

        LocalDate now = LocalDate.now();
        int month = now.getMonthValue();

        String rt = month > 2 && month < 6 ? "봄이다":"봄아니다";
        System.out.println("month = "+month);
        System.out.println("rt = "+rt);

    }
}
