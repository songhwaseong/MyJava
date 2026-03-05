package ch02_control_statement;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class For01 {
    static void main(String[] args) {
        int total = 0;
        List<Integer> lst = new ArrayList<>();

        //for문
        for(int i=1;i<11;i++){
            total += i;
            lst.add(i);
        }
        System.out.printf("1부터 10까지의 합은 = %d \n",total);

        //for문 2
        total = 0;
        for(int i : lst){
            total += i;
        }
        System.out.printf("1부터 10까지의 합은 = %d \n",total);

        //stream
        total = lst.stream().mapToInt(i -> i).sum();
        System.out.printf("1부터 10까지의 합은 = %d \n",total);

        total = 0;
        for(int i=1;i<101; i+=3){
            total += i;
        }
        System.out.printf("1부터 10까지의 합은 = %d \n",total);

        total = 0;
        for(int i=97; i> 1;i-=5){
            total += i;
        }
        System.out.printf(" %d \n",total);

        total = 0;
        for(int i=1; i< 97;i+=5){
            total += (int)Math.pow(i,2);
        }
        System.out.printf("%d \n",total);

    }
}
