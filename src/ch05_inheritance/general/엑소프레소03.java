package ch05_inheritance.general;

public class 엑소프레소03 extends 음료03{
    private int 샷추가;

    public 엑소프레소03(String 이름, double 단가, int 샷추가) {
        super(이름, 단가);
        this.샷추가 = 샷추가;
    }

    public int get샷추가() {
        return 샷추가;
    }

    @Override
    public void 정보출력(){
        super.정보출력();
        System.out.println("샷추가: "+샷추가 + "번");
    }
}
