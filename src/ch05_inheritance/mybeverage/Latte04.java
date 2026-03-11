package ch05_inheritance.mybeverage;

public class Latte04 extends Beverage04{
    private String 우유타입;
    public Latte04(String 이름, double 단가, String 우유타입) {
        super(이름, 단가);
        this.우유타입 = 우유타입;
    }

    public void 정보출력(){
        super.정보출력();
        System.out.println("우유타입: "+우유타입);
    }

    @Override
    public void 메서드호출(){
        this.달달();
    }

    public void 달달(){
        System.out.println("달달하네");
    }
}
