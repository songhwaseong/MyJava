package ch02_control_statement;

public class ForSwitch01 {
    static void main(String[] args) {

        int evenTot = 0;
        int oddTot = 0;

        for(int i=1;i<11;i++){
            switch (i % 2){     //식으로 표현가능
                case 1:
                    oddTot+=i;
                    break;
                case 0:
                    evenTot+=i;
                    break;
            }
        }

        System.out.printf("홀수 합 : %d\n",oddTot);
        System.out.printf("짝수 합 : %d",evenTot);

    }
}
