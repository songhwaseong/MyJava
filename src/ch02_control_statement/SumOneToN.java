package ch02_control_statement;

public class SumOneToN {
    static void main(String[] args) {
        int n = 5;
        int tot = 0;

        for(int i =1;i<n+1;i++){
            tot += i;
        }

        System.out.printf("1부터 %d 까지의 총합은 %d 입니다.",n,tot);
    }
}
