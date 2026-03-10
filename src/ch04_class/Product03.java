package ch04_class;


public class Product03 extends Product01{
    public Product03(){}
    public Product03(String name, String inputDate) {
        super(name, inputDate);
    }
    public Product03(String name, int price, String inputDate) {
        super(name, price, inputDate);
    }

    public void disPlay() {
        System.out.println("상품명 : "+ super.getName());
        System.out.println("단가 : "+ super.getPrice());
        System.out.println("입고 : "+ super.getInputDate());
    }
}
