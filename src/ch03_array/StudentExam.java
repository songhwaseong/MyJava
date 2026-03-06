package ch03_array;

import java.util.Scanner;

public class StudentExam {
    static void main(String[] ignoredArgs) {

        String name;
        double tot = 0.0;
        Integer[] score = new Integer[3];

        Scanner s = new Scanner(System.in);
        do {
            System.out.print("이름 입력 : ");
            name = s.nextLine().replaceAll(" ", "");
        } while (name.isEmpty());

        for(int i=0;i<3;i++){
            System.out.print("점수 입력: ");
            score[i] = s.nextInt();
            tot += score[i];
        }

        double avg = tot/3;

        System.out.println("\n학생의 정보");
        System.out.printf("이름 : %s, 총점: %.2f, 평균: %.2f", name,tot,avg);


    }
}
