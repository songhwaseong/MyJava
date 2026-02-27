package ch01_variable_operator;

public class PlusMinus01 {
    static void main(String[] args) {
        int a = 10, b = 20, c = 0;
        c = a++ + --b;


        a =10;
        b =20;

        ++a;
        b--;

        c = ++a + b--;


        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
        System.out.println("c : "+ c);
    }
}
