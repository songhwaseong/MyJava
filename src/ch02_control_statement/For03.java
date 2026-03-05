package ch02_control_statement;

public class For03 {
    static void main(String[] args) {
        int total = 0;

        for(int i=1;i<51;i++){
            total += i;
        }
        System.out.printf("총합 01 : %d\n",total);

        total = 0;
        for(int i=2;i<101;i+=2){
            total += i;
        }
        System.out.printf("총합 02 : %d\n",total);

        total = 0;
        for(int i=1;i<100;i+=2){
            total += i;
        }
        System.out.printf("총합 03 : %d\n",total);

        total = 0;
        for(int i=100;i>4;i-=5){
            total += i;
        }
        System.out.printf("총합 04 : %d\n",total);

        total = 0;
        for(int i=2;i<21;i+=2){
            total += (int) Math.pow(i, 2);
        }
        System.out.printf("총합 05 : %d\n",total);

        total = 0;
        for(int i=5;i<101;i+=5){
            total += (int)Math.pow(i,2);
        }
        System.out.printf("총합 06 : %d",total);

        //이중 for문
        System.out.println();
        for(int i= 2;i<10;i++){
            for(int j=1;j<10;j++){
                System.out.print(" "+i+" * "+j+" = "+ (i*j) + "|");
            }
            System.out.println();
        }



        // 1 + 2 + 3 + ... + 50 = 1275
        // 2 + 4 + 6 + ... + 100 = 2550
        // 1 + 3 + 5 + ... + 99 = 2500
        // 100 + 95 + 90 + ... + 5 = 1050
        // 2² + 4² + 6² + ... + 20² = 1540
        // 5² + 10² + 15² + ... + 100²= 71750

    }
}


