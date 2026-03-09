package ch04_class;

public class Product01 {
    private String name;
    private String inputDate;
    private int price;

    public Product01(String name, int price, String inputDate) {
        this.name = name;
        this.inputDate = inputDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int plusFive(){
        return this.price + 5;
    }

    public Integer plusFive(Integer x){
        return (x == null ? 3 : 0) + 5;
    }

    public int plusFive(int...x){
        int result = 0;
        for(int p : x){
            result += p;
        }
        return result;
    }

    @Override
    public String toString() {
        return "상품명 : "+getName() + "\n"
                +"단가 : "+getPrice()+"원" + "\n"
                +"입고 : "+getInputDate() + "\n";
    }

    public void print(){
        System.out.println(toString());
    }
    public void print2(){
        System.out.println(toString());
    }
}
