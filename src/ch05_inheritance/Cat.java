package ch05_inheritance;

public class Cat  extends Animal{
    private boolean isIndoor;

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    @Override
    public void bark() {
        System.out.printf("%s 이(가) 야옹 짖는중\n", super.getName());
    }

    @Override
    public void display() {
        System.out.printf("이름 : %s \n나이 : %d \n반려펫여부 : %s \n", super.getName(), super.getAge(), isIndoor ? "실내":"실외");
    }
}
