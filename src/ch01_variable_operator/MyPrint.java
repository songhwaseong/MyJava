package ch01_variable_operator;

import java.util.*;
import java.util.stream.Collector;

public class MyPrint {
    public static void main(String ...args) {
        System.out.println("헬로우");

        List<String> a = new ArrayList<>();
        a.add("한국 > ");
        a.add("미국 > ");
        a.add("중국 > ");
        a.add("일본 > ");
        a.sort(Comparator.reverseOrder());
        Collections.sort(a);
        a.forEach(System.out::print);

    }
}
