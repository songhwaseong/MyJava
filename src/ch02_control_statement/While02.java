package ch02_control_statement;

public class While02 {
    static void main(String[] args) {

        int evenTot = 0;
        int oddTot = 0;
        int i=1;

        while(i<11){
            switch (i % 2){
                case 1:
                    oddTot+=i;
                    break;
                case 0:
                    evenTot+=i;
                    break;
            }
            i++;
        }

        System.out.printf("홀수 합 : %d\n",oddTot);
        System.out.printf("짝수 합 : %d",evenTot);

    }

}
