package ch05_inheritance.general;

public class 아메리카노03 extends 음료03{
    private double 물의양;

    public 아메리카노03(String 이름, double 단가, double 물의양) {
        super(이름, 단가);
        this.물의양 = 물의양;
    }

    public double get물의양() {
        return 물의양;
    }

    public void set물의양(double 물의양) {
        this.물의양 = 물의양;
    }

    public void 정보출력(){
        super.정보출력();
        System.out.println("투입된 물의 양: "+물의양 + "ml");
    }
}
