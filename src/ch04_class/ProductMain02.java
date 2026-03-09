package ch04_class;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProductMain02 {
    static void main(String[] args) {

        Product02.brand ="nongsim";
        System.out.println(Product02.brand);

        String formatedNow = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        Product02 shin = new Product02("신라면", 2300, formatedNow);
        Product02 blackBean = new Product02("짜파게티", 1800, formatedNow);

        shin.brand ="nongsim2";
        System.out.println("-----------------------------");
        System.out.println("상품명 : "+shin.getName());
        System.out.println("단가 : "+shin.getPrice());
        System.out.println("입고 : "+shin.getInputDate());

        System.out.println("-----------------------------");
        System.out.println("상품명 : "+blackBean.getName());
        System.out.println("단가 : "+blackBean.getPrice());
        System.out.println("입고 : "+blackBean.getInputDate());
        System.out.println(shin.brand);

    }
}
