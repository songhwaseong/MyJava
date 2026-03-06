package ch02_control_statement;

import java.util.Scanner;

public class While04 {
    static void main(String[] args) {

        int tot = 0;
        double avg = 0.0;
        int score = 0;
        int cnt = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("점수를 입력해 주세요 (음수일시 종료) ------->  ");
        while(true){
            try {
                if(s.hasNextLine()){
                    score = Integer.parseInt(s.nextLine().replaceAll(" ",""));

                    if(score < 0){
                        avg = (double)tot/cnt;
                        System.out.printf("총합은 %d, 평균은 %.1f",tot, avg);
                        break;
                    }

                    ++cnt;
                    tot += score;

                }
            }catch (NumberFormatException ne){
                System.out.println("숫자를 입력해주세요");
            }catch (Exception e) {
                System.out.println("Exception 종료합니다.");
                break;
            }
        }
    }
}
