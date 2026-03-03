package ch01_variable_operator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Casting {
    static void main(String[] args) {
        double d = 100d;
        System.out.println("d : "+ d);


        int i = (int)3.14;
        System.out.println("i : "+ i);

        String a = "1234.333";
        d = Double.parseDouble(a);
        System.out.println("a : "+ a);
        System.out.println("d : "+ d);

        System.out.println((double)15/4);

        int kor = 50, eng = 60, math = 80;
        int total = kor + eng + math;
        double avg = (double)total / 3;
        System.out.println("total : "+total);
        System.out.println("avg : "+ Math.round(avg * 10)/10.0 );

        List<Integer> score = new ArrayList<>();
        score.add(50);
        score.add(60);
        score.add(80);

        avg =  score.stream().mapToDouble(p-> (double)p).average().getAsDouble();
        System.out.println("avg : "+ Math.round(avg * 10)/10.0 );

        char ch1 = 'c';
        char ch2 = 'a';
        boolean bool1 = ch1 > ch2;

        String k = "";
        System.out.println("bool1 : "+bool1);
        int p = (int)ch1 ;
        System.out.println("p : "+p);
        System.out.println(ch1 + " - "+ch2+": "+ (ch1 - ch2));
        System.out.println(ch1 + " - "+ch2+": "+ (ch1 / ch2));

        char ch3 = 'D';
        String str = ch3 >= 'A' && ch3 <= 'Z' ? "대":"대아님";
        System.out.println("str  : "+ str);

        System.out.println("str  : "+ (ch3+93));

        char pp = 97;
        System.out.println("pp  : "+ pp);
    }
}
