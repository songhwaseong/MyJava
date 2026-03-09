package ch04_class;

import java.util.Scanner;

public class CalMain {
    static void main(String[] args) {
//        boolean isRecord = false;
//        Scanner s;
//        if(isRecord){
//            s = new Scanner(System.in);
//            System.out.print("첫번째 숫자를 넣어주세요 =====>  ");
//            int f = Integer.parseInt(s.nextLine());
//            System.out.print("연산자를 넣어주세요(+,-,*,/) =====>  ");
//            String o = s.nextLine();
//            System.out.print("두번째 숫자를 넣어주세요 ======> ");
//            int t = Integer.parseInt(s.nextLine());
//            Cal2 c2 = new Cal2(f,o,t);
//            c2.println();
//        }else{
//            Cal c = new Cal();
//            s = new Scanner(System.in);
//            System.out.print("첫번째 숫자를 넣어주세요 =====>  ");
//            c.setFirstNum(Integer.parseInt(s.nextLine()));
//            System.out.print("연산자를 넣어주세요(+,-,*,/) =====>  ");
//            c.setOperator(s.nextLine());
//            System.out.print("두번째 숫자를 넣어주세요 ======> ");
//            c.setTwoNum(Integer.parseInt(s.nextLine()));
//            c.println();
//        }

        Calc k = (x, y)-> x / y;

        System.out.println(k.calute(100,50));
    }
}
