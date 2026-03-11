package ch05_inheritance.mybeverage;

import ch05_inheritance.general.음료03;

public class Americano04 extends Beverage04{
    private double 물의양;
    public Americano04(String 이름, double 단가, double 물의양) {
        super(이름, 단가);
        this.물의양 =  물의양;
    }

    @Override
    public void 정보출력(){
        super.정보출력();
        System.out.println("투입된 물의 양: "+물의양 + "ml");
    }

    @Override
    public void 메서드호출(){
        this.얼죽아();
    }

    public void 얼죽아(){
        String message = super.get이름()+"를 홀짝 홀짝 마십니다.";
        System.out.println(message);
    }
}
