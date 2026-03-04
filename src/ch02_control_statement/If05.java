package ch02_control_statement;

public class If05 {
    static void main(String[] args) {
        int su = 14;

        if(su % 7 == 0){
            System.out.println((int)Math.pow(su,2));
        }else{
            System.out.println(su+3);
        }

        System.out.println(su % 7 == 0 ? (int)Math.pow(su,2) : su+3);
    }
}
