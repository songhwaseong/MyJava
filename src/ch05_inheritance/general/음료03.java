package ch05_inheritance.general;

public class 음료03 {

    private String 이름;
    private double 단가;

    public  음료03(){

    }

    public 음료03(String 이름, double 단가){
        this.이름 = 이름;
        this.단가 = 단가;
    }

    public String get이름() {
        return 이름;
    }

    public void set이름(String 이름) {
        this.이름 = 이름;
    }

    public double get단가() {
        return 단가;
    }

    public void set단가(double 단가) {
        this.단가 = 단가;
    }

    public void 정보출력(){
        System.out.println("음료이름 : "+ this.이름);
        System.out.println("음료단가 : "+ this.단가);
    }
}
