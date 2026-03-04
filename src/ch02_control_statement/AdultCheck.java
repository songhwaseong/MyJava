package ch02_control_statement;


public class AdultCheck {
    static void main(String[] args) {
        int age = 50;
        int gender = 2;

        String gender_gb = gender == 1 || gender == 3 ? "남자":"여자";
        String adult_gb = age > 18 ? "성인":"미성년자";

        System.out.printf("나이 : %d, 성별 : %s", age, gender_gb);
        System.out.printf("나이 : %d, 성별 : %s, 성인여부 : %s", age, gender_gb, adult_gb);
    }
}
