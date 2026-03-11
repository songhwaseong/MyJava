package ch05_inheritance.general;

public class 상속테스트03 {
    static void main(String[] args) {
        아메리카노03 아객 = new 아메리카노03("Americano",4000.0,200.0);
        엑소프레소03 엑객 = new 엑소프레소03("Exopresso",2000.0,3);
        라떼03 라객  = new 라떼03("Latte",1500.0,"아몬드 우유");

        System.out.println("---------------");
        아객.정보출력();
        System.out.println("---------------");
        엑객.정보출력();
        System.out.println("---------------");
        라객.정보출력();
    }
}
