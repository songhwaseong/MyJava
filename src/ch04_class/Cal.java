package ch04_class;

import java.util.Scanner;

public class Cal {
    private String operator;
    private int firstNum;
    private int twoNum;
    private double result;

    public Cal(){
        inputData();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getTwoNum() {
        return twoNum;
    }

    public void setTwoNum(int twoNum) {
        this.twoNum = twoNum;
    }

    public double calculate(){
        switch (this.operator){
            case "+":
                result = this.firstNum + this.twoNum;
                break;
            case "-":
                result = this.firstNum - this.twoNum;
                break;
            case "*":
                result = this.firstNum * this.twoNum;
                break;
            case "/":
                result = (double)this.firstNum / this.twoNum;
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        return "결과 : %d %s %d = %.1f \n";
    }

    public void println(){
        println(toString());
    }

    private void println(String str){
        System.out.printf(str, firstNum,operator,twoNum,calculate());
    }

    public void inputData(){
        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 숫자를 넣어주세요 =====>  ");
        this.setFirstNum(Integer.parseInt(s.nextLine()));
        System.out.print("연산자를 넣어주세요(+,-,*,/) =====>  ");
        this.setOperator(s.nextLine());
        System.out.print("두번째 숫자를 넣어주세요 ======> ");
        this.setTwoNum(Integer.parseInt(s.nextLine()));
    }
}
