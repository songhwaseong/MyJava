package ch02_control_statement;

public class If02 {
    static void main(String[] args) {
        int a = 4;
        if(a %2 == 0){
            System.out.println("하하하");
        }else{
            System.out.println("호호호");
        }

        System.out.println(a % 2==0 ? "하하하" : "호호호");

        a = 10;
        int b = 20;
        char operator = '/';

        switch (operator){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
        }
    }
}
