package ch03_array;

import java.util.*;
import java.util.stream.Collectors;

public class MyArr01 {
    static void main(String[] args) {
        int x= 3;
        int y= 5;

        Integer[] arr = new Integer[3];
        arr[0] = x - y + 6 ;
        arr[2] = arr[0] + 3 ;
        arr[1] = arr[0] + arr[2];

        //stream
        String s = Arrays.stream(arr).map(String::valueOf).collect(Collectors.joining("\n"));
        System.out.println(s);

        for(Integer i : arr){
            System.out.println(i);
        }

        for (Integer integer : arr) {
            System.out.println(integer);
        }

        Integer[] brr = {15, 30, 22};
        for (Integer integer : brr) {
            System.out.println(integer);
        }

    }
}
