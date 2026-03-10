package ch05_inheritance;

public class Dog extends Animal{
    private boolean isGuide;

    public boolean isGuide() {
        return isGuide;
    }

    public void setGuide(boolean guide) {
        isGuide = guide;
    }

    @Override
    public void bark() {
        System.out.printf("%s 이(가) 멍멍 짖는중\n", super.getName());
    }

    @Override
    public void display() {
        System.out.printf("이름 : %s \n나이 : %d \n안내견여부 : %s \n", super.getName(), super.getAge(), isGuide ? "적합":"부적합");
    }
}
