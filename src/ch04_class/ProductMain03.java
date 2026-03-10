package ch04_class;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductMain03 {
    static String formatedNow = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    static void main(String[] args) {

        Product03 shin = new Product03("신라면",1000, formatedNow);
        Product03 blackBean = new Product03("짜장면",1500, formatedNow);
        List<Product03> lst = new ArrayList<>();
        lst.add(shin);
        lst.add(blackBean);
        lst.add(new Product03("진라면", formatedNow));
        lst.stream().peek(p-> System.out.println("-----------------")).forEach(Product03::disPlay);

//        int size = 10000;
//        Product03[] tmpArr = new Product03[size];
//
//        for(int i=0;i<tmpArr.length;i++){
//            tmpArr[i] = new Product03("라면_"+i, 1000+i, formatedNow+"_"+i);
//            System.out.println("-----------------");
//            tmpArr[i].disPlay();
//        }

        Product03[] p03Arr = {shin, blackBean};
        for (Product03 product03 : p03Arr) {
            System.out.println("-----------------");
            product03.disPlay();
        }

    }
}
