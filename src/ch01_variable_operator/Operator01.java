package ch01_variable_operator;

public class Operator01 {
    static void main(String[] args) {
        int a= 10;
        int b = 8;

        boolean bool1 = a!=b;
        boolean bool2 = --a == b++;
        boolean bool3 = a++ != --b;
        boolean bool4 = bool3 && (5>7);
        boolean bool5 = !bool4 || (bool1 && bool2);

        System.out.println("bool1 : "+bool1);
        System.out.println("bool1 : "+bool2);
        System.out.println("bool1 : "+bool3);
        System.out.println("bool1 : "+bool4);
        System.out.println("bool1 : "+bool5);

        int x = 3, y=8, z=4;
        int max = x > y ? x > z ? x : z : y > z ? y : z;
        System.out.println(x+","+y+","+z+" 중 최대수는 "+max + "입니다." );

        a = 3 -(-2);
        b=3;
        x = (a >=b) ? 5 : (a+2);

        x += ++a;
        y = ++a;
        y += a + --b;

        char ch3 = 'D';
        z = ch3 >= 'A' && ch3 <= 'Z' ? --y:x+2;

        int result = 0;
        result = x>y ? z-y: x+z;

        System.out.println("result : " + result);

    }
}
