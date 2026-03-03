package ch01_variable_operator;

import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LogicalOperator {
    static void main(String[] args) {
        int x = 3, y = 2 ;

        System.out.println("x = " + x + ", y=" + y);
        System.out.println("x > y : " + ( x > y));
        System.out.println("x > y : " + ( x < y));
        System.out.println("x > y : " + ( x >= y));
        System.out.println("x > y : " + ( x != y));

        System.out.println("4 < 5 && 3 != 6 : " + (4 < 5 && 3 != 6));
        System.out.println("4 < 7 || 3 != 6 : " + (4 < 7 || 3 != 6));
        System.out.println("8 < 7 || 3 != 6 : " + (8 < 7 || 3 != 6));
        System.out.println("8 < 7 || 3 == 6 : " + (8 < 7 || 3 == 6));

        boolean isTrue = 8 < 7 || 3 == 6;

        System.out.println("8 < 7 && 3 != 6 : " + isTrue);


        LocalDate now = LocalDate.now();
        int month = now.getMonthValue();

        boolean result = month > 2 && month < 6;
        System.out.println("result :  " + result);



    }
}
