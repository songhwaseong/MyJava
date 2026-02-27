package ch01_variable_operator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PrintMe {
    static void main(String[] args) {
        String firstName = "";
        String lastName = new String();
        int age = 0;
        long age2 = 0L;
        float height = 0f;
        double weight = 0d;
        String blood = "";
        char type = 'a';
        boolean isTrue = false;

        Map<String, Object> hmap = new HashMap<>();
        hmap.put("firstName","song");
        hmap.put("lastName","hwaseong");
        hmap.put("age",45);
        hmap.put("height",170.3f);
        hmap.put("weight",93.1);
        hmap.put("blood","O");
        hmap.put("type",'C');
        hmap.put("isTrue",true);

        hmap.forEach((key, value) -> System.out.println(key+" : "+value));
        //List<String> lst = hmap.values().stream().collect(Collectors.toList());


//        System.out.println("성 : "+firstName);
//        System.out.println("이름 : "+lastName);
//        System.out.println("나이 : "+age);
//        System.out.println("키 : "+height);
//        System.out.println("몸무게 : "+weight);
//        System.out.println("혈액형 : "+blood);
//        System.out.println("타입 : "+type);
//        System.out.println("진위 : "+isTrue);


        String name = "홍길동";
        double korean = 40.0;
        double english = 43.0;
        double avg = (korean + english) / 2;

        System.out.println("국어 : "+ korean);
        System.out.println("영어 : "+ english);
        System.out.println("평균 : "+ avg);

        Map<String, Double> hmap1 = new HashMap<>();
        hmap1.put("korean", 40.0);
        hmap1.put("english", 43.0);
        System.out.println("국어 : "+ (Double)hmap1.get("korean"));
        System.out.println("영어 : "+ (Double)hmap1.get("english"));
        System.out.println("평균 : "+ ((Double)hmap1.get("korean") + (Double)hmap1.get("english"))/2);

        avg = hmap1.values().stream().mapToDouble(p-> (Double)p).average().getAsDouble();
        System.out.println("평균 : "+ avg);


    }
}
