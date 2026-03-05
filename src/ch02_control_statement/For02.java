package ch02_control_statement;

public class For02 {
    static void main(String[] args) {
        int evenTot = 0;
        int oddTot = 0;

        for(int i=1;i<11;i++){
            if(i % 2 == 0){
                evenTot += i;
            }else{
                oddTot += i;
            }
        }

        System.out.printf("짝수 합 %d \n",evenTot);
        System.out.printf("홀수 합 %d",oddTot);
    }
}
