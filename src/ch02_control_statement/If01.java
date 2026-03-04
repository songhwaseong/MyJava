package ch02_control_statement;

public class If01 {
    static void main(String[] args) {
        int su = 4;

        if(su % 2 == 0){
            System.out.println(su + "는 짝수");
        }else {
            System.out.println(su + "는 홀수");
        }
    }
}
