package ch02_control_statement;

public class Switch03 {
    static void main(String[] args) {
        String name = "김철수";
        char grade = 'A';
        String[] presentArr = {"빌딩","자동차","노트북"};

        String present = "";
        switch (grade){
            case 'A':
                present = " " + presentArr[0];
            case 'B':
                present += " " + presentArr[1];
            case 'C':
                present += " " + presentArr[2];
        }


        String message = "%s님의 경품은%s 입니다.";
        System.out.printf(message, name, present);

        double avg = 74.66666666666;
        message = "평균 : %.3f";
        System.out.printf(message, avg);

        message = String.format(message, avg);
        System.out.printf(message);
    }
}
