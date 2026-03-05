package ch02_control_statement;

public class While01 {
    static void main(String[] args) {
        int total = 0;

        int i = 1;
        while(i<11){
            total += i;
            i++;
        }

        System.out.println("총합 01 : "+ total);

        i = 1;
        total = 0;
        while(i<101){
            total += i;
            i+=3;
        }

        System.out.println("총합 02 : "+ total);

        i = 97;
        total = 0;
        while(i>1){
            total += i;
            i-=5;
        }

        System.out.println("총합 03 : "+ total);

        i = 1;
        total = 0;
        while(i<97){
            total += (int)Math.pow(i,2);
            i+=5;
        }
        System.out.println("총합 04 : "+ total);
    }
}
