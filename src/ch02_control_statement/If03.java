package ch02_control_statement;

public class If03 {
    static void main(String[] args) {
        int jumsu = 75;

        if(jumsu >= 90){
            System.out.println("A");
        } else if (jumsu >= 80) {
            System.out.println("B");
        } else if (jumsu >= 70) {
            System.out.println("C");
        } else if (jumsu >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
