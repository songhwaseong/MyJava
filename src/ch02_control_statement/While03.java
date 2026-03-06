package ch02_control_statement;

import java.util.Scanner;

public class While03 {
    static void main(String[] args) {
        int answer = 40;
        int input = 0;
        String inp= "";

        Scanner s = new Scanner(System.in);
        while(true){

            System.out.print("1부터 100까지 숫자를 넣어주세요 ----> ");
            try {
                input = Integer.parseInt(s.nextLine().trim().replaceAll(" ",""));

                if(answer == input){
                    System.out.println("That's right");
                    break;
                }else if(input > answer){
                    System.out.println("down");
                }else if(input < answer){
                    System.out.println("up");
                }else if(input < 1 || input > 100){
                    System.out.println("1~100");
                }else{
                    System.out.println("틀렸습니다.");
                }
            }catch (NumberFormatException ne){
                System.out.println("숫자가 아닙니다.");
                continue;
            }catch (Exception e){
                System.out.println("Error");
                e.printStackTrace();
                break;
            }finally {
                System.out.println();
            }
         }
    }
}
