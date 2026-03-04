package ch02_control_statement;

public class TotalExam01 {
    static void main(String[] args) {


        String name = "김철수";
        int kor = 50, eng = 50, math = 70 ;
        String grade ; // 학점 변수
        String message = "" ;
        int total = kor+eng+math;
        double avg = (double)total/3;

        if(avg >= 90){
            grade = "A";
        }else if(avg >= 80){
            grade = "B";
        }else if(avg >= 70){
            grade = "C";
        }else if(avg >= 60){
            grade = "D";
        }else{
            grade = "F";
        }

        switch (grade){
            case "A":
            case "B":
                message = "참 잘 하셨습니다.";
                break;
            case "C":
            case "D":
                message = "조금만 더 노력하세요.";
                break;
            case "F":
                message = "다음 학기에 재수강하세요.";
                break;
            default:
                message = "잘못된 입력입니다.";
        }

        System.out.printf("이름 : %s \n", name);
        System.out.printf("국어 : %d점, 영어 : %d점, 수학 : %d점 \n", kor,eng,math);
        System.out.printf("총점 : %d점, 평균 : %.1f점 \n", total, avg);
        System.out.printf("학점 : %s \n", grade);
        System.out.printf(message);






//        학점이 "A" 또는 "B"이면 "참 잘 하셨습니다."를 message 변수에 저장한다.
//        학점이 "C" 또는 "D"이면 "조금만 더 노력하세요."를 message 변수에 저장한다.
//        학점이 "F"이면 "다음 학기에 재수강하세요."를 message 변수에 저장한다.
//        그 외의 값이 입력되면 "잘못된 입력입니다."를 message 변수에 저장한다.
//
//        출력 예시
//        이름 : 김철수님
//        국어 : 85점, 영어 : 70점, 수학 : 90점
//        총점 : 245점, 평균 : 81.66666
//        학점 : B
//        메시지 : 참 잘 하셨습니다.

    }
}
