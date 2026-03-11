package ch05_inheritance.mybeverage;

import ch05_inheritance.general.음료03;

import java.util.Arrays;

public class InheTest04 {
    static void main(String... args) {

        음료03[] 음료03Arry =
        {
             new Americano04("아메리카노",4000.0, 2500)
            ,new Espresso04("엑소프레소",4000,3)
            ,new Latte04("",3000,"아몬드 우유")
            ,new Americano04("아메리카노",4000.0, 2500)
            ,new Espresso04("엑소프레소",4000,3)
            ,new Latte04("",3000,"아몬드 우유")
        };

        Arrays
                .stream(음료03Arry)
                .map(p-> p instanceof Americano04 ? (Americano04)p : p instanceof Espresso04 ? (Espresso04)p : (Latte04)p)
                .forEach(Beverage04::메서드호출);

//        for(음료03 a : 음료03Arry){
//            if(a instanceof Americano04){
//                Americano04 a4 = (Americano04) a;
//                a4.얼죽아();
//            }else if(a instanceof Espresso04){
//                Espresso04 e4 = (Espresso04) a;
//                e4.쓴한잔();
//            }else if(a instanceof Latte04){
//                Latte04 l4 = (Latte04) a;
//                l4.달달();
//            }
//        }

        //형변환을 강제로 할경우 자식클래스 형변환하다 exception 발생
//        for(음료03 a : 음료03Arry){
//            Americano04 a4 = (Americano04) a;
//            a4.얼죽아();
//        }

    }
}
