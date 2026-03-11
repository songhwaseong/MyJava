package ch05_inheritance.mybeverage;

import ch05_inheritance.general.음료03;

public class Beverage04 extends 음료03 {

    public Beverage04(String 이름, double 단가) {
        super(이름, 단가);
    }

    public void 메서드호출() {
        System.out.println("자식클래스 특정메소드 호출");
    }
}
