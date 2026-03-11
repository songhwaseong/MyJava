package ch05_inheritance.general;

public class 라떼03  extends 음료03{
    private String 우유타입;

    public 라떼03(String 이름, double 단가, String 우유타입) {
        super(이름, 단가);
        this.우유타입 = 우유타입;
    }

    public String get우유타입() {
        return 우유타입;
    }

    @Override
    public void 정보출력(){
        super.정보출력();
        System.out.println("우유타입: "+우유타입);
    }
}
