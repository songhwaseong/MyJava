package ch04_class;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProductMain01 {
    static void main(String[] args) {

        LocalDate now = LocalDate.now();         // 포맷 정의
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formatedNow = now.format(formatter);

        Product01 shin = new Product01("신라면", 1500, formatedNow );
        Product01 blackbean = new Product01("짜파게티", 1350, formatedNow );

        System.out.println("상품 정보 출력");
        System.out.println("-----------------");
        shin.print();
        System.out.println("-----------------");
        blackbean.print();

        Integer su = null;
        int result = shin.plusFive(su);
        System.out.println(result);
    }
}
