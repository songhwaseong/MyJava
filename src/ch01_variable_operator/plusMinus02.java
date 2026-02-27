package ch01_variable_operator;

public class plusMinus02 {
    static void main(String[] args) {
        int x= 3, y=5, z;
        z = x ++ + --y;

        System.out.println("x : "+x);
        System.out.println("y : "+y);
        System.out.println("z : "+z);

        z += --x + y++;
        System.out.println("x : "+x);
        System.out.println("y : "+y);
        System.out.println("z : "+z);

     }
}
