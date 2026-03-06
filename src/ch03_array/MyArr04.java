package ch03_array;

import java.util.Scanner;

public class MyArr04 {
    static void main(String[] ignoredArgs) {
        int cnt = 0;
        int size;
        int evenTot = 0;
        int oddTot = 0;
        int input;

        Scanner s = new Scanner(System.in);
        while(true){
            try {
                System.out.print("배열 요소 갯수 입력 ======>  ");
                String in = s.nextLine().replaceAll(" ", "");
                size = in.isEmpty() ?0:Integer.parseInt(in);
                if(size > 0) break;
            }catch (NumberFormatException ne){
                System.out.println("숫자를 입력해주세요");
            }
        }

        Integer[] arr = new Integer[size];
        System.out.println("숫자 입력 ======>  ");
        do {
            try {
                String in = s.nextLine().replaceAll(" ", "");
                if(in.isEmpty())continue;
                input = Integer.parseInt(in);
                arr[cnt++] = input;
                if (input % 2 == 0) {
                    evenTot += input;
                } else {
                    oddTot += input;
                }
            }catch (NumberFormatException ne){
                System.out.println("숫자를 입력해주세요");
            }
        } while (cnt != arr.length);

        System.out.printf("짝수 합 : %d \n",evenTot);
        System.out.printf("홀수 합 : %d",oddTot);
    }
}
