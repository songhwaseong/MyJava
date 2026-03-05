package ch02_control_statement;

public class PrintStar {
    static void main(String[] args) {

        int star = 12;

        for(int i=1;i<star+1;i++){
            System.out.print("*"+(i%5==0?"\n":""));
        }
    }
}
