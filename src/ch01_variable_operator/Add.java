package ch01_variable_operator;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Add {
    static void main(String[] args) {
        int a= 3;
        int b= a;
        System.out.println(a+" 더하기 "+ b +" 는 "+ (a + b)+ " 입니다");
        a = 4;
        System.out.println(a+" 곱하기 "+ b +" 는 "+ (a * b)+ " 입니다");

        List<Integer> x = new ArrayList<>();
        x.add(3);
        x.add(5);
        x.forEach(System.out::println);

        int result = 0;
//        for(int k : x){
//            result += k;
//        }

//        for(int i=0;i<x.size();i++){
//            result += x.get(i);
//        }

//        int i=0;
//        while(true){
//            if(i < x.size()){
//                result += x.get(i);
//                i++;
//            }else
//                break;
//
//        }




        System.out.println(result);

        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> list = listSupplier.get();
        list.add("aaaaa1");
        list.add("1aaaaa2");
        list.add("3aaaaa3");
        list.add("aa3343aaa1");
        //List<String> k=  list.stream().collect(Collectors.toList());
        List<String> k=  list;

        k.forEach(System.out::println);
        list.add("adfe");
        k.forEach(System.out::println);

        Set<String> kkk = new HashSet<>();
        kkk.add("adfe");
        kkk.add("adfe1");
        kkk.add("adfe");
        kkk.forEach(System.out::println);

        Map<String, Integer> hmap = new HashMap<>();
        hmap.put("a",1);
        hmap.put("b",2);
        hmap.put("c",3);
        System.out.println(""+ hmap.get("c"));
        Set<String> p =  hmap.keySet();
        hmap.values().stream().forEach(System.out::println);

        //집에서 푸쉬하기

        String[] aaaa = new String[]{"aa", "bb"};
        Arrays.sort(aaaa);
        Arrays.stream(aaaa).forEach(System.out::println);
    }
}
