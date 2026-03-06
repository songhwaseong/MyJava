package ch02_control_statement;

import java.util.HashMap;
import java.util.Map;

public class Difference {
    static void main(String[] args) {
        int sumA = 0;
        int sumB = 0;
        int diff =0;

        for(int i=1;i<51;i++){
            if(i%3==0){
                sumB += i;
            }else{
                sumA += i;
            }
        }
        System.out.printf("3의 배수의 총합 : %d \n" , sumB ); // 408
        System.out.printf("3의 배수가 아닌 정수의 총합 : %d\n" , sumA ); // 867
        diff = sumA - sumB;
        System.out.printf("차이 : %d" , diff ); // 459

    }
}
