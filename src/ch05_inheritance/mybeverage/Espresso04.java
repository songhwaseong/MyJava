package ch05_inheritance.mybeverage;

public class Espresso04 extends Beverage04{
    private int 샷추가;
    public Espresso04(String 이름, double 단가, int 샷추가) {
        super(이름, 단가);
        this.샷추가 = 샷추가;
    }

    public void 정보출력(){
        super.정보출력();
        System.out.println("샷추가: "+샷추가 + "번");
    }

    @Override
    public void 메서드호출(){
        this.쓴한잔();
    }

    public void 쓴한잔(){
        System.out.println("졸라 쓰네");
    }

}
