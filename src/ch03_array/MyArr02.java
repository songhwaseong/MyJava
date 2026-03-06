package ch03_array;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyArr02 {
    static void main(String[] args) {
        String[] bts = new String[7];

        bts[0] = "진";
        bts[1] = "뷔";
        bts[2] = "정국";
        bts[3] = "지우개";
        bts[4] = "지민";
        bts[5] = "설탕";
        bts[6] = "제이홉";


        //join?
        String k = String.join("\n", bts);
        System.out.println(k);
    }
}
